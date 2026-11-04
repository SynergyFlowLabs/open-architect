package io.ktor.util;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.c3;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nNonce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Nonce.kt\nio/ktor/util/NonceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f296500a = "SHA1PRNG";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f296502c = 30000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f296503d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f296504e = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.r0 f296506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final p2 f296507h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final List<String> f296501b = CollectionsKt.listOf((Object[]) new String[]{"NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG"});

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final kotlinx.coroutines.channels.p<String> f296505f = kotlinx.coroutines.channels.s.d(1024, null, null, 6, null);

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", f = "Nonce.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {76}, m = "invokeSuspend", n = {"seedChannel", "previousRoundNonceList", "secureInstance", "weakRandom", "secureBytes", "weakBytes", "randomNonceList", "lastReseed", FirebaseAnalytics.d.f120644b0}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296509b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f296511d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f296512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f296513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f296514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        long f296515h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f296516i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f296517j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f296518k;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00da A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:6:0x002f, B:25:0x00fb, B:22:0x00da, B:26:0x00fd, B:28:0x010c, B:13:0x0078, B:15:0x0083, B:16:0x008c, B:18:0x0098, B:20:0x00a9, B:19:0x00a6), top: B:38:0x002f }] */
        /* JADX WARN: Code duplicated, block: B:24:0x00fa A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00f8 -> B:25:0x00fb). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 304
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.c1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static {
        kotlinx.coroutines.r0 r0Var = new kotlinx.coroutines.r0("nonce-generator");
        f296506g = r0Var;
        f296507h = kotlinx.coroutines.i.d(f2.f314023a, kotlinx.coroutines.l1.c().plus(c3.f313552a).plus(r0Var), kotlinx.coroutines.u0.LAZY, new a(null));
    }

    public static final void b() {
        f296507h.start();
    }

    private static final SecureRandom c(String str) {
        try {
            return str != null ? SecureRandom.getInstance(str) : new SecureRandom();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    static /* synthetic */ SecureRandom d(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return c(str);
    }

    private static /* synthetic */ void e() {
    }

    @NotNull
    public static final kotlinx.coroutines.channels.p<String> f() {
        return f296505f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureRandom g() {
        SecureRandom secureRandomC;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null && (secureRandomC = c(property)) != null) {
            return secureRandomC;
        }
        Iterator<String> it = f296501b.iterator();
        while (it.hasNext()) {
            SecureRandom secureRandomC2 = c(it.next());
            if (secureRandomC2 != null) {
                return secureRandomC2;
            }
        }
        org.slf4j.c cVarL = org.slf4j.e.l("io.ktor.util.random");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("None of the ");
        boolean z10 = false;
        sb2.append(CollectionsKt.joinToString$default(f296501b, ", ", null, null, 0, null, null, 62, null));
        sb2.append(" found, fallback to default");
        cVarL.m0(sb2.toString());
        SecureRandom secureRandomD = d(null, 1, null);
        if (secureRandomD != null) {
            return secureRandomD;
        }
        throw new IllegalStateException("No SecureRandom implementation found");
    }
}
