/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.inputmethod.keyboard.internal;

import android.content.res.TypedArray;
import android.util.Log;

import java.util.HashMap;

public abstract class KeyStyle {
    private HashMap<String, String> mKeyMap = new HashMap<>();
    private final KeyboardTextsSet mTextsSet;

    public abstract String[] getStringArray(TypedArray a, int index);
    public abstract String getString(TypedArray a, int index);
    public abstract int getInt(TypedArray a, int index, int defaultValue);
    public abstract int getFlags(TypedArray a, int index);

    protected KeyStyle(final KeyboardTextsSet textsSet) {
        mTextsSet = textsSet;
        mKeyMap.put("0x16F00", "\uD81B\uDF00");
        mKeyMap.put("0x16F01", "\uD81B\uDF01");
        mKeyMap.put("0x16F02", "\uD81B\uDF02");
        mKeyMap.put("0x16F03", "\uD81B\uDF03");
        mKeyMap.put("0x16F04", "\uD81B\uDF04");
        mKeyMap.put("0x16F05", "\uD81B\uDF05");
        mKeyMap.put("0x16F06", "\uD81B\uDF06");
        mKeyMap.put("0x16F07", "\uD81B\uDF07");
        mKeyMap.put("0x16F08", "\uD81B\uDF08");
        mKeyMap.put("0x16F09", "\uD81B\uDF09");
        mKeyMap.put("0x16F0A", "\uD81B\uDF0A");
        mKeyMap.put("0x16F0B", "\uD81B\uDF0B");
        mKeyMap.put("0x16F0C", "\uD81B\uDF0C");
        mKeyMap.put("0x16F0D", "\uD81B\uDF0D");
        mKeyMap.put("0x16F0E", "\uD81B\uDF0E");
        mKeyMap.put("0x16F0F", "\uD81B\uDF0F");
        mKeyMap.put("0x16F10", "\uD81B\uDF10");
        mKeyMap.put("0x16F11", "\uD81B\uDF11");
        mKeyMap.put("0x16F12", "\uD81B\uDF12");
    }

    protected String parseString(final TypedArray a, final int index) {
        if (a.hasValue(index)) {
            String text = a.getString(index);
            String realText = mKeyMap.get(text);
            if (realText != null) {
                text = realText;
                Log.e("MIAO", text);
                return text;
            } else {
                return mTextsSet.resolveTextReference(text);
            }
        }
        return null;
    }

    protected String[] parseStringArray(final TypedArray a, final int index) {
        if (a.hasValue(index)) {
            final String text = mTextsSet.resolveTextReference(a.getString(index));
            return MoreKeySpec.splitKeySpecs(text);
        }
        return null;
    }
}
