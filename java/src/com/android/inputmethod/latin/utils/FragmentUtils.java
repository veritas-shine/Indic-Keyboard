/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.inputmethod.latin.utils;

import org.smc.inputmethod.dictionarypack.DictionarySettingsFragment;

import java.util.HashSet;

import org.smc.inputmethod.miao.about.AboutPreferences;
import org.smc.inputmethod.miao.settings.AdvancedSettingsFragment;
import org.smc.inputmethod.miao.settings.AppearanceSettingsFragment;
import org.smc.inputmethod.miao.settings.CorrectionSettingsFragment;
import org.smc.inputmethod.miao.settings.CustomInputStyleSettingsFragment;
import org.smc.inputmethod.miao.settings.DebugSettingsFragment;
import org.smc.inputmethod.miao.settings.GestureSettingsFragment;
import org.smc.inputmethod.miao.settings.MultiLingualSettingsFragment;
import org.smc.inputmethod.miao.settings.PreferencesSettingsFragment;
import org.smc.inputmethod.miao.settings.SettingsFragment;
import org.smc.inputmethod.miao.settings.ThemeSettingsFragment;
import org.smc.inputmethod.miao.spellcheck.SpellCheckerSettingsFragment;
import org.smc.inputmethod.miao.userdictionary.UserDictionaryAddWordFragment;
import org.smc.inputmethod.miao.userdictionary.UserDictionaryList;
import org.smc.inputmethod.miao.userdictionary.UserDictionaryLocalePicker;
import org.smc.inputmethod.miao.userdictionary.UserDictionarySettings;

public class FragmentUtils {
    private static final HashSet<String> sLatinImeFragments = new HashSet<>();
    static {
        sLatinImeFragments.add(DictionarySettingsFragment.class.getName());
        sLatinImeFragments.add(AboutPreferences.class.getName());
        sLatinImeFragments.add(PreferencesSettingsFragment.class.getName());
        sLatinImeFragments.add(AppearanceSettingsFragment.class.getName());
        sLatinImeFragments.add(ThemeSettingsFragment.class.getName());
        sLatinImeFragments.add(MultiLingualSettingsFragment.class.getName());
        sLatinImeFragments.add(CustomInputStyleSettingsFragment.class.getName());
        sLatinImeFragments.add(GestureSettingsFragment.class.getName());
        sLatinImeFragments.add(CorrectionSettingsFragment.class.getName());
        sLatinImeFragments.add(AdvancedSettingsFragment.class.getName());
        sLatinImeFragments.add(DebugSettingsFragment.class.getName());
        sLatinImeFragments.add(SettingsFragment.class.getName());
        sLatinImeFragments.add(SpellCheckerSettingsFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryAddWordFragment.class.getName());
        sLatinImeFragments.add(UserDictionaryList.class.getName());
        sLatinImeFragments.add(UserDictionaryLocalePicker.class.getName());
        sLatinImeFragments.add(UserDictionarySettings.class.getName());
    }

    public static boolean isValidFragment(String fragmentName) {
        return sLatinImeFragments.contains(fragmentName);
    }
}
