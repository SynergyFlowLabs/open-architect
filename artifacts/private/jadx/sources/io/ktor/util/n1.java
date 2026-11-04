package io.ktor.util;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class n1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SecretKeySpec f296741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f296742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f296743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function0<String> f296744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f296745e;

    public n1(@NotNull SecretKeySpec keySpec, @NotNull String algorithm, long j10, @NotNull Function0<String> nonceGenerator) throws NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(keySpec, "keySpec");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(nonceGenerator, "nonceGenerator");
        this.f296741a = keySpec;
        this.f296742b = algorithm;
        this.f296743c = j10;
        this.f296744d = nonceGenerator;
        Mac mac = Mac.getInstance(algorithm);
        mac.init(keySpec);
        this.f296745e = mac.getMacLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e() {
        return b0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f() {
        return b0.e();
    }

    @Override // io.ktor.util.d1
    @Nullable
    public Object a(@NotNull kotlin.coroutines.d<? super String> dVar) throws NoSuchAlgorithmException, InvalidKeyException {
        String strInvoke = this.f296744d.invoke();
        String string = Long.toString(System.nanoTime(), CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strU3 = StringsKt.U3(string, 16, org.locationtech.jts.geom.l.f338160j);
        Mac mac = Mac.getInstance(this.f296742b);
        mac.init(this.f296741a);
        byte[] bytes = (strInvoke + AbstractJsonLexerKt.COLON + strU3).getBytes(Charsets.f313189f);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        mac.update(bytes);
        byte[] bArrDoFinal = mac.doFinal();
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
        return strInvoke + '+' + strU3 + '+' + b0.h(bArrDoFinal);
    }

    @Override // io.ktor.util.d1
    @Nullable
    public Object b(@NotNull String str, @NotNull kotlin.coroutines.d<? super Boolean> dVar) throws NoSuchAlgorithmException, InvalidKeyException {
        List listT4 = StringsKt.T4(str, new char[]{'+'}, false, 0, 6, null);
        if (listT4.size() != 3) {
            return kotlin.coroutines.jvm.internal.b.a(false);
        }
        String str2 = (String) listT4.get(0);
        String str3 = (String) listT4.get(1);
        String str4 = (String) listT4.get(2);
        if (str2.length() >= 8 && str4.length() == this.f296745e * 2 && str3.length() == 16 && Long.parseLong(str3, CharsKt.checkRadix(16)) + TimeUnit.MILLISECONDS.toNanos(this.f296743c) >= System.nanoTime()) {
            Mac mac = Mac.getInstance(this.f296742b);
            mac.init(this.f296741a);
            byte[] bytes = (str2 + AbstractJsonLexerKt.COLON + str3).getBytes(Charsets.f313189f);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            mac.update(bytes);
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            String strH = b0.h(bArrDoFinal);
            int iMin = Math.min(strH.length(), str4.length());
            int i10 = 0;
            for (int i11 = 0; i11 < iMin; i11++) {
                if (strH.charAt(i11) == str4.charAt(i11)) {
                    i10++;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(i10 == this.f296745e * 2);
        }
        return kotlin.coroutines.jvm.internal.b.a(false);
    }

    @NotNull
    public final String g() {
        return this.f296742b;
    }

    @NotNull
    public final SecretKeySpec h() {
        return this.f296741a;
    }

    @NotNull
    public final Function0<String> i() {
        return this.f296744d;
    }

    public final long j() {
        return this.f296743c;
    }

    public /* synthetic */ n1(SecretKeySpec secretKeySpec, String str, long j10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(secretKeySpec, (i10 & 2) != 0 ? "HmacSHA256" : str, (i10 & 4) != 0 ? 60000L : j10, (Function0<String>) ((i10 & 8) != 0 ? new Function0() { // from class: io.ktor.util.m1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.e();
            }
        } : function0));
    }

    public /* synthetic */ n1(byte[] bArr, String str, long j10, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? "HmacSHA256" : str, (i10 & 4) != 0 ? 60000L : j10, (Function0<String>) ((i10 & 8) != 0 ? new Function0() { // from class: io.ktor.util.l1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n1.f();
            }
        } : function0));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n1(@NotNull byte[] key, @NotNull String algorithm, long j10, @NotNull Function0<String> nonceGenerator) {
        this(new SecretKeySpec(key, algorithm), algorithm, j10, nonceGenerator);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        Intrinsics.checkNotNullParameter(nonceGenerator, "nonceGenerator");
    }
}
