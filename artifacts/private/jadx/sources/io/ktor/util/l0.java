package io.ktor.util;

import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@oj.g
final class l0 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final MessageDigest f296718a;

    private /* synthetic */ l0(MessageDigest messageDigest) {
        this.f296718a = messageDigest;
    }

    public static final /* synthetic */ l0 c(MessageDigest messageDigest) {
        return new l0(messageDigest);
    }

    @Nullable
    public static Object d(MessageDigest messageDigest, @NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return bArrDigest;
    }

    @NotNull
    public static MessageDigest e(@NotNull MessageDigest delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return delegate;
    }

    public static boolean f(MessageDigest messageDigest, Object obj) {
        return (obj instanceof l0) && Intrinsics.areEqual(messageDigest, ((l0) obj).m());
    }

    public static final boolean g(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return Intrinsics.areEqual(messageDigest, messageDigest2);
    }

    public static int i(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    public static void j(MessageDigest messageDigest, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        messageDigest.update(bytes);
    }

    public static void k(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    public static String l(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override // io.ktor.util.k0
    public void a(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        j(this.f296718a, bytes);
    }

    @Override // io.ktor.util.k0
    @Nullable
    public Object b(@NotNull kotlin.coroutines.d<? super byte[]> dVar) {
        return d(this.f296718a, dVar);
    }

    public boolean equals(Object obj) {
        return f(this.f296718a, obj);
    }

    @NotNull
    public final MessageDigest h() {
        return this.f296718a;
    }

    public int hashCode() {
        return i(this.f296718a);
    }

    public final /* synthetic */ MessageDigest m() {
        return this.f296718a;
    }

    @Override // io.ktor.util.k0
    public void reset() {
        k(this.f296718a);
    }

    public String toString() {
        return l(this.f296718a);
    }
}
