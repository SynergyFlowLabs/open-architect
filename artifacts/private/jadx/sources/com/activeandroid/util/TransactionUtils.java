package com.activeandroid.util;

import androidx.annotation.m1;
import com.activeandroid.ActiveAndroid;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TransactionUtils {

    @NotNull
    public static final TransactionUtils INSTANCE = new TransactionUtils();

    private TransactionUtils() {
    }

    @n
    @m1
    public static final <T> T executeAsTransaction(@NotNull Callable<T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ActiveAndroid.beginTransaction();
        try {
            T tCall = action.call();
            ActiveAndroid.setTransactionSuccessful();
            return tCall;
        } finally {
            ActiveAndroid.endTransaction();
        }
    }
}
