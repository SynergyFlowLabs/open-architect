package io.ktor.util;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class d0 {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.CryptoKt__CryptoJvmKt$generateNonceBlocking$1", f = "CryptoJvm.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f296560a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f296560a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return obj;
            }
            ResultKt.m(obj);
            kotlinx.coroutines.channels.p<String> pVarF = c1.f();
            this.f296560a = 1;
            Object objJ = pVarF.j(this);
            return objJ == objL ? objL : objJ;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super String> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @NotNull
    public static final k0 b(@NotNull String name) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(name, "name");
        MessageDigest messageDigest = MessageDigest.getInstance(name);
        Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(...)");
        return l0.c(l0.e(messageDigest));
    }

    @NotNull
    public static final String c() {
        String str = (String) kotlinx.coroutines.channels.t.h(c1.f().w());
        return str != null ? str : d();
    }

    private static final String d() {
        c1.b();
        return (String) kotlinx.coroutines.j.b(null, new a(null), 1, null);
    }

    private static final byte[] e(String str, String str2, Function1<? super String, String> function1) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        String strInvoke = function1.invoke(str);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = strInvoke.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bytes2 = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes2);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "with(...)");
        return bArrDigest;
    }

    @NotNull
    public static final Function1<String, byte[]> f(@NotNull final String algorithm, @NotNull final Function1<? super String, String> salt) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(salt, "salt");
        return new Function1() { // from class: io.ktor.util.c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d0.g(algorithm, salt, (String) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] g(String str, Function1 function1, String e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        return e(e10, str, function1);
    }

    @NotNull
    public static final byte[] h(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        byte[] bArrDigest = MessageDigest.getInstance(com.planner5d.library.services.utility.e0.f225194b).digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return bArrDigest;
    }
}
