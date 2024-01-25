/*
 * SPDX-FileCopyrightText: 2017 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */
package com.libremobileos.updater;

import androidx.appcompat.app.AppCompatActivity;

import com.libremobileos.updater.model.UpdateInfo;

public abstract class UpdatesListActivity extends AppCompatActivity {
    public abstract void exportUpdate(UpdateInfo update);
    public abstract void showSnackbar(int stringId, int duration);
}
