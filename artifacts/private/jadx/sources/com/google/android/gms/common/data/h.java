package com.google.android.gms.common.data;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import rx.internal.operators.OperatorReplay;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106388a = "next_page_token";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @g6.a
    public static final String f106389b = "prev_page_token";

    private h() {
    }

    @NonNull
    public static <T, E extends j<T>> ArrayList<T> a(@NonNull b<E> bVar) {
        OperatorReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(bVar.getCount());
        try {
            Iterator<E> it = bVar.iterator();
            while (it.hasNext()) {
                unboundedReplayBuffer.add(it.next().freeze());
            }
            bVar.close();
            return unboundedReplayBuffer;
        } catch (Throwable th2) {
            bVar.close();
            throw th2;
        }
    }

    public static boolean b(@NonNull b<?> bVar) {
        return bVar != null && bVar.getCount() > 0;
    }

    public static boolean c(@NonNull b<?> bVar) {
        Bundle bundleZ = bVar.z();
        return (bundleZ == null || bundleZ.getString(f106388a) == null) ? false : true;
    }

    public static boolean d(@NonNull b<?> bVar) {
        Bundle bundleZ = bVar.z();
        return (bundleZ == null || bundleZ.getString(f106389b) == null) ? false : true;
    }
}
