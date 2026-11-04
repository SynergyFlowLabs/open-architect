package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.GraphRequest;
import com.facebook.internal.z0;
import com.facebook.r0;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f100483a = new g0();

    private g0() {
    }

    @oj.n
    @NotNull
    public static final GraphRequest a(@NotNull String authorizationCode, @NotNull String redirectUri, @NotNull String codeVerifier) {
        Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", authorizationCode);
        com.facebook.g0 g0Var = com.facebook.g0.f99617a;
        bundle.putString("client_id", com.facebook.g0.o());
        bundle.putString(z0.f100292w, redirectUri);
        bundle.putString("code_verifier", codeVerifier);
        GraphRequest graphRequestH = GraphRequest.f98518n.H(null, "oauth/access_token", null);
        graphRequestH.q0(r0.GET);
        graphRequestH.r0(bundle);
        return graphRequestH;
    }

    @oj.n
    @NotNull
    public static final String b(@NotNull String codeVerifier, @NotNull b codeChallengeMethod) throws com.facebook.u {
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(codeChallengeMethod, "codeChallengeMethod");
        if (!d(codeVerifier)) {
            throw new com.facebook.u("Invalid Code Verifier.");
        }
        if (codeChallengeMethod == b.PLAIN) {
            return codeVerifier;
        }
        try {
            byte[] bytes = codeVerifier.getBytes(Charsets.f313188e);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance(org.apache.commons.codec.digest.g.f335251e);
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e10) {
            throw new com.facebook.u(e10);
        }
    }

    @oj.n
    @NotNull
    public static final String c() {
        int iG1 = kotlin.ranges.r.g1(new IntRange(43, 128), kotlin.random.f.f312895a);
        List listPlus = CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends char>) CollectionsKt.plus((Collection<? extends Character>) CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new kotlin.ranges.c('a', ni.f.f333372i), (Iterable) new kotlin.ranges.c('A', 'Z')), (Iterable) new kotlin.ranges.c(org.locationtech.jts.geom.l.f338160j, '9')), Character.valueOf(org.apache.commons.codec.language.l.f335457d)), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iG1);
        for (int i10 = 0; i10 < iG1; i10++) {
            Character ch2 = (Character) CollectionsKt.random(listPlus, kotlin.random.f.f312895a);
            ch2.charValue();
            arrayList.add(ch2);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @oj.n
    public static final boolean d(@Nullable String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").k(str);
    }
}
