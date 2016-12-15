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
        mKeyMap.put("0x16F13", "\uD81B\uDF13");
        mKeyMap.put("0x16F14", "\uD81B\uDF14");
        mKeyMap.put("0x16F15", "\uD81B\uDF15");
        mKeyMap.put("0x16F16", "\uD81B\uDF16");
        mKeyMap.put("0x16F17", "\uD81B\uDF17");
        mKeyMap.put("0x16F18", "\uD81B\uDF18");
        mKeyMap.put("0x16F19", "\uD81B\uDF19");
        mKeyMap.put("0x16F1A", "\uD81B\uDF1A");
        mKeyMap.put("0x16F1B", "\uD81B\uDF1B");
        mKeyMap.put("0x16F1C", "\uD81B\uDF1C");
        mKeyMap.put("0x16F1D", "\uD81B\uDF1D");
        mKeyMap.put("0x16F1E", "\uD81B\uDF1E");
        mKeyMap.put("0x16F1F", "\uD81B\uDF1F");

        mKeyMap.put("0x16F20", "\uD81B\uDF20");
        mKeyMap.put("0x16F21", "\uD81B\uDF21");
        mKeyMap.put("0x16F22", "\uD81B\uDF22");
        mKeyMap.put("0x16F23", "\uD81B\uDF23");
        mKeyMap.put("0x16F24", "\uD81B\uDF24");
        mKeyMap.put("0x16F25", "\uD81B\uDF25");
        mKeyMap.put("0x16F26", "\uD81B\uDF26");
        mKeyMap.put("0x16F27", "\uD81B\uDF27");
        mKeyMap.put("0x16F28", "\uD81B\uDF28");
        mKeyMap.put("0x16F29", "\uD81B\uDF29");
        mKeyMap.put("0x16F2A", "\uD81B\uDF2A");
        mKeyMap.put("0x16F2B", "\uD81B\uDF2B");
        mKeyMap.put("0x16F2C", "\uD81B\uDF2C");
        mKeyMap.put("0x16F2D", "\uD81B\uDF2D");
        mKeyMap.put("0x16F2E", "\uD81B\uDF2E");
        mKeyMap.put("0x16F2F", "\uD81B\uDF2F");

        mKeyMap.put("0x16F30", "\uD81B\uDF30");
        mKeyMap.put("0x16F31", "\uD81B\uDF31");
        mKeyMap.put("0x16F32", "\uD81B\uDF32");
        mKeyMap.put("0x16F33", "\uD81B\uDF33");
        mKeyMap.put("0x16F34", "\uD81B\uDF34");
        mKeyMap.put("0x16F35", "\uD81B\uDF35");
        mKeyMap.put("0x16F36", "\uD81B\uDF36");
        mKeyMap.put("0x16F37", "\uD81B\uDF37");
        mKeyMap.put("0x16F38", "\uD81B\uDF38");
        mKeyMap.put("0x16F39", "\uD81B\uDF39");
        mKeyMap.put("0x16F3A", "\uD81B\uDF3A");
        mKeyMap.put("0x16F3B", "\uD81B\uDF3B");
        mKeyMap.put("0x16F3C", "\uD81B\uDF3C");
        mKeyMap.put("0x16F3D", "\uD81B\uDF3D");
        mKeyMap.put("0x16F3E", "\uD81B\uDF3E");
        mKeyMap.put("0x16F3F", "\uD81B\uDF3F");

        mKeyMap.put("0x16F40", "\uD81B\uDF40");
        mKeyMap.put("0x16F41", "\uD81B\uDF41");
        mKeyMap.put("0x16F42", "\uD81B\uDF42");
        mKeyMap.put("0x16F43", "\uD81B\uDF43");
        mKeyMap.put("0x16F44", "\uD81B\uDF44");
        mKeyMap.put("0x16F45", "\uD81B\uDF45");
        mKeyMap.put("0x16F46", "\uD81B\uDF46");
        mKeyMap.put("0x16F47", "\uD81B\uDF47");
        mKeyMap.put("0x16F48", "\uD81B\uDF48");
        mKeyMap.put("0x16F49", "\uD81B\uDF49");
        mKeyMap.put("0x16F4A", "\uD81B\uDF4A");
        mKeyMap.put("0x16F4B", "\uD81B\uDF4B");
        mKeyMap.put("0x16F4C", "\uD81B\uDF4C");
        mKeyMap.put("0x16F4D", "\uD81B\uDF4D");
        mKeyMap.put("0x16F4E", "\uD81B\uDF4E");
        mKeyMap.put("0x16F4F", "\uD81B\uDF4F");

        mKeyMap.put("0x16F50", "\uD81B\uDF50");
        mKeyMap.put("0x16F51", "\uD81B\uDF51");
        mKeyMap.put("0x16F52", "\uD81B\uDF52");
        mKeyMap.put("0x16F53", "\uD81B\uDF53");
        mKeyMap.put("0x16F54", "\uD81B\uDF54");
        mKeyMap.put("0x16F55", "\uD81B\uDF55");
        mKeyMap.put("0x16F56", "\uD81B\uDF56");
        mKeyMap.put("0x16F57", "\uD81B\uDF57");
        mKeyMap.put("0x16F58", "\uD81B\uDF58");
        mKeyMap.put("0x16F59", "\uD81B\uDF59");
        mKeyMap.put("0x16F5A", "\uD81B\uDF5A");
        mKeyMap.put("0x16F5B", "\uD81B\uDF5B");
        mKeyMap.put("0x16F5C", "\uD81B\uDF5C");
        mKeyMap.put("0x16F5D", "\uD81B\uDF5D");
        mKeyMap.put("0x16F5E", "\uD81B\uDF5E");
        mKeyMap.put("0x16F5F", "\uD81B\uDF5F");

        mKeyMap.put("0x16F60", "\uD81B\uDF60");
        mKeyMap.put("0x16F61", "\uD81B\uDF61");
        mKeyMap.put("0x16F62", "\uD81B\uDF62");
        mKeyMap.put("0x16F63", "\uD81B\uDF63");
        mKeyMap.put("0x16F64", "\uD81B\uDF64");
        mKeyMap.put("0x16F65", "\uD81B\uDF65");
        mKeyMap.put("0x16F66", "\uD81B\uDF66");
        mKeyMap.put("0x16F67", "\uD81B\uDF67");
        mKeyMap.put("0x16F68", "\uD81B\uDF68");
        mKeyMap.put("0x16F69", "\uD81B\uDF69");
        mKeyMap.put("0x16F6A", "\uD81B\uDF6A");
        mKeyMap.put("0x16F6B", "\uD81B\uDF6B");
        mKeyMap.put("0x16F6C", "\uD81B\uDF6C");
        mKeyMap.put("0x16F6D", "\uD81B\uDF6D");
        mKeyMap.put("0x16F6E", "\uD81B\uDF6E");
        mKeyMap.put("0x16F6F", "\uD81B\uDF6F");

        mKeyMap.put("0x16F70", "\uD81B\uDF70");
        mKeyMap.put("0x16F71", "\uD81B\uDF71");
        mKeyMap.put("0x16F72", "\uD81B\uDF72");
        mKeyMap.put("0x16F73", "\uD81B\uDF73");
        mKeyMap.put("0x16F74", "\uD81B\uDF74");
        mKeyMap.put("0x16F75", "\uD81B\uDF75");
        mKeyMap.put("0x16F76", "\uD81B\uDF76");
        mKeyMap.put("0x16F77", "\uD81B\uDF77");
        mKeyMap.put("0x16F78", "\uD81B\uDF78");
        mKeyMap.put("0x16F79", "\uD81B\uDF79");
        mKeyMap.put("0x16F7A", "\uD81B\uDF7A");
        mKeyMap.put("0x16F7B", "\uD81B\uDF7B");
        mKeyMap.put("0x16F7C", "\uD81B\uDF7C");
        mKeyMap.put("0x16F7D", "\uD81B\uDF7D");
        mKeyMap.put("0x16F7E", "\uD81B\uDF7E");
        mKeyMap.put("0x16F7F", "\uD81B\uDF7F");

        mKeyMap.put("0x16F80", "\uD81B\uDF80");
        mKeyMap.put("0x16F81", "\uD81B\uDF81");
        mKeyMap.put("0x16F82", "\uD81B\uDF82");
        mKeyMap.put("0x16F83", "\uD81B\uDF83");
        mKeyMap.put("0x16F84", "\uD81B\uDF84");
        mKeyMap.put("0x16F85", "\uD81B\uDF85");
        mKeyMap.put("0x16F86", "\uD81B\uDF86");
        mKeyMap.put("0x16F87", "\uD81B\uDF87");
        mKeyMap.put("0x16F88", "\uD81B\uDF88");
        mKeyMap.put("0x16F89", "\uD81B\uDF89");
        mKeyMap.put("0x16F8A", "\uD81B\uDF8A");
        mKeyMap.put("0x16F8B", "\uD81B\uDF8B");
        mKeyMap.put("0x16F8C", "\uD81B\uDF8C");
        mKeyMap.put("0x16F8D", "\uD81B\uDF8D");
        mKeyMap.put("0x16F8E", "\uD81B\uDF8E");
        mKeyMap.put("0x16F8F", "\uD81B\uDF8F");

        mKeyMap.put("0x16F90", "\uD81B\uDF90");
        mKeyMap.put("0x16F91", "\uD81B\uDF91");
        mKeyMap.put("0x16F92", "\uD81B\uDF92");
        mKeyMap.put("0x16F93", "\uD81B\uDF93");
        mKeyMap.put("0x16F94", "\uD81B\uDF94");
        mKeyMap.put("0x16F95", "\uD81B\uDF95");
        mKeyMap.put("0x16F96", "\uD81B\uDF96");
        mKeyMap.put("0x16F97", "\uD81B\uDF97");
        mKeyMap.put("0x16F98", "\uD81B\uDF98");
        mKeyMap.put("0x16F99", "\uD81B\uDF99");
        mKeyMap.put("0x16F9A", "\uD81B\uDF9A");
        mKeyMap.put("0x16F9B", "\uD81B\uDF9B");
        mKeyMap.put("0x16F9C", "\uD81B\uDF9C");
        mKeyMap.put("0x16F9D", "\uD81B\uDF9D");
        mKeyMap.put("0x16F9E", "\uD81B\uDF9E");
        mKeyMap.put("0x16F9F", "\uD81B\uDF9F");
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
