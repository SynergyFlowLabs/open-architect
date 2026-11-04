package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface k {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f122095a;

        static {
            int i10 = 6 ^ 1;
        }

        a(int i10) {
            this.f122095a = i10;
        }

        public int l() {
            return this.f122095a;
        }
    }

    @NonNull
    a a(@NonNull String str);
}
