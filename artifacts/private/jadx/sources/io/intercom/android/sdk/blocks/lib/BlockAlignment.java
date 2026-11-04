package io.intercom.android.sdk.blocks.lib;

import androidx.core.view.d0;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public enum BlockAlignment {
    LEFT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.1
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return d0.f48643b;
        }
    },
    CENTER { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.2
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return 1;
        }
    },
    RIGHT { // from class: io.intercom.android.sdk.blocks.lib.BlockAlignment.3
        @Override // io.intercom.android.sdk.blocks.lib.BlockAlignment
        public int getGravity() {
            return d0.f48644c;
        }
    };

    public static BlockAlignment alignValueOf(String str) {
        try {
            return valueOf(str.toUpperCase(Locale.ENGLISH));
        } catch (IllegalArgumentException | NullPointerException unused) {
            return LEFT;
        }
    }

    public abstract int getGravity();
}
