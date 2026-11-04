package com.google.android.gms.common.stats;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @g6.a
    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @g6.a
        public static final int f106884a = 7;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g6.a
        public static final int f106885b = 8;
    }

    public abstract int O1();

    public abstract long T1();

    @NonNull
    public abstract String b2();

    @NonNull
    public final String toString() {
        return T1() + "\t" + O1() + "\t-1" + b2();
    }
}
