package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class c extends Random {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f312888c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f312889d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f312890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f312891b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public c(@NotNull f impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f312890a = impl;
    }

    @NotNull
    public final f a() {
        return this.f312890a;
    }

    @Override // java.util.Random
    protected int next(int i10) {
        return this.f312890a.b(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f312890a.c();
    }

    @Override // java.util.Random
    public void nextBytes(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f312890a.e(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f312890a.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f312890a.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f312890a.l();
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f312890a.o();
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f312891b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f312891b = true;
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return this.f312890a.m(i10);
    }
}
