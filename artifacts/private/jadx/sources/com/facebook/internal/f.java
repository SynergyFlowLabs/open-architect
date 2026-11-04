package com.facebook.internal;

import android.content.Intent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements com.facebook.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f99815b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Map<Integer, a> f99816c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<Integer, a> f99817a = new HashMap();

    public interface a {
        boolean a(int i10, @Nullable Intent intent);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        private final synchronized a b(int i10) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            return (a) f.f99816c.get(Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @oj.n
        public final boolean d(int i10, int i11, Intent intent) {
            a aVarB = b(i10);
            if (aVarB != null) {
                return aVarB.a(i11, intent);
            }
            int i12 = 7 << 0;
            return false;
        }

        @oj.n
        public final synchronized void c(int i10, @NotNull a callback) {
            try {
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (f.f99816c.containsKey(Integer.valueOf(i10))) {
                    return;
                }
                f.f99816c.put(Integer.valueOf(i10), callback);
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private b() {
        }
    }

    public enum c {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f99836a;

        c(int i10) {
            this.f99836a = i10;
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] cVarArrValuesCustom = values();
            return (c[]) Arrays.copyOf(cVarArrValuesCustom, cVarArrValuesCustom.length);
        }

        public final int l() {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            return com.facebook.g0.u() + this.f99836a;
        }
    }

    @oj.n
    public static final synchronized void c(int i10, @NotNull a aVar) {
        try {
            f99815b.c(i10, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(int i10, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f99817a.put(Integer.valueOf(i10), callback);
    }

    public final void d(int i10) {
        this.f99817a.remove(Integer.valueOf(i10));
    }

    @Override // com.facebook.k
    public boolean e(int i10, int i11, @Nullable Intent intent) {
        a aVar = this.f99817a.get(Integer.valueOf(i10));
        return aVar == null ? f99815b.d(i10, i11, intent) : aVar.a(i11, intent);
    }
}
