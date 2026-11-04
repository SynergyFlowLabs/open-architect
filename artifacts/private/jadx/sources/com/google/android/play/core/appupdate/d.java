package com.google.android.play.core.appupdate;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(boolean z10);

        @NonNull
        public abstract a c(@e7.b int i10);
    }

    @NonNull
    public static d c(@e7.b int i10) {
        return d(i10).a();
    }

    @NonNull
    public static a d(@e7.b int i10) {
        a0 a0Var = new a0();
        a0Var.c(i10);
        a0Var.b(false);
        return a0Var;
    }

    public abstract boolean a();

    @e7.b
    public abstract int b();
}
