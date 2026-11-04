package com.planner5d.library.activity.fragment.startup;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.v2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f136486d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<com.planner5d.library.activity.fragment.startup.a> f136487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f136488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v2 f136489c;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.activity.fragment.startup.StartupAgreementProvider", f = "StartupAgreementProvider.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {14, 16, 20}, m = "requireAgreement", n = {"this", "agreement", "isAborted", "this", "agreement", "isAborted", "this", "agreement", "isAborted"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f136490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f136491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f136492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f136493d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f136495f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f136493d = obj;
            this.f136495f |= Integer.MIN_VALUE;
            return h.this.a(null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull fg.e<com.planner5d.library.activity.fragment.startup.a> agreementChecker, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> showAgreementMessage) {
        Intrinsics.checkNotNullParameter(agreementChecker, "agreementChecker");
        Intrinsics.checkNotNullParameter(showAgreementMessage, "showAgreementMessage");
        this.f136487a = agreementChecker;
        this.f136488b = showAgreementMessage;
        this.f136489c = new v2();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0097  */
    /* JADX WARN: Code duplicated, block: B:24:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c1 A[PHI: r8 r9 r10
      0x00c1: PHI (r8v1 kotlin.jvm.functions.Function0<java.lang.Boolean>) = (r8v3 kotlin.jvm.functions.Function0<java.lang.Boolean>), (r8v12 kotlin.jvm.functions.Function0<java.lang.Boolean>) binds: [B:28:0x00bd, B:18:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r9v1 com.planner5d.library.legal.model.manager.a$a) = (r9v2 com.planner5d.library.legal.model.manager.a$a), (r9v8 com.planner5d.library.legal.model.manager.a$a) binds: [B:28:0x00bd, B:18:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r10v1 com.planner5d.library.activity.fragment.startup.h) = (r10v2 com.planner5d.library.activity.fragment.startup.h), (r10v10 com.planner5d.library.activity.fragment.startup.h) binds: [B:28:0x00bd, B:18:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        if (r11.a(r0) == r1) goto L36;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e2 -> B:15:0x0045). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.planner5d.library.legal.model.manager.a.EnumC1566a r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.planner5d.library.activity.fragment.startup.h.a(com.planner5d.library.legal.model.manager.a$a, kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    public final void b() {
        this.f136489c.b();
    }
}
