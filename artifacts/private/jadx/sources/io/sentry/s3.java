package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s3 implements p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s3 f306771a = new s3();

    private s3() {
    }

    public static s3 R() {
        return f306771a;
    }

    @Override // io.sentry.p1
    @NotNull
    public da A() {
        return new da(io.sentry.protocol.v.f306474b, "");
    }

    @Override // io.sentry.p1
    public void B(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.p1
    public boolean C(@NotNull e6 e6Var) {
        return false;
    }

    @Override // io.sentry.p1
    public void D(@Nullable Throwable th2) {
    }

    @Override // io.sentry.p1
    public void E(@Nullable x9 x9Var) {
    }

    @Override // io.sentry.p1
    @NotNull
    public String E6() {
        return "";
    }

    @Override // io.sentry.p1
    @Nullable
    public e F(@Nullable List<String> list) {
        return null;
    }

    @Override // io.sentry.p1
    public void G(@NotNull String str, @NotNull Number number, @NotNull p2 p2Var) {
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 I(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var, @NotNull w9 w9Var) {
        return R();
    }

    @Override // io.sentry.p1
    @Nullable
    public Object J(@Nullable String str) {
        return null;
    }

    @Override // io.sentry.p1
    public void K(@Nullable String str, @Nullable Object obj) {
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 M(@NotNull p9 p9Var, @NotNull w9 w9Var) {
        return R();
    }

    @Override // io.sentry.p1
    @NotNull
    public e6 N() {
        return new f8();
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 P(@NotNull String str, @Nullable String str2) {
        return R();
    }

    @Override // io.sentry.p1
    @NotNull
    public e6 Q() {
        return new f8();
    }

    @Override // io.sentry.p1
    public void a(@Nullable String str, @Nullable String str2) {
    }

    @Override // io.sentry.p1
    @Nullable
    public Throwable b() {
        return null;
    }

    @Override // io.sentry.p1
    public void c(@Nullable x9 x9Var) {
    }

    @Override // io.sentry.p1
    @NotNull
    public w8 d() {
        return new w8(io.sentry.protocol.v.f306474b, v9.f307008b, Boolean.FALSE);
    }

    @Override // io.sentry.p1
    @Nullable
    public Boolean f() {
        return null;
    }

    @Override // io.sentry.p1
    @Nullable
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 h(@NotNull String str) {
        return R();
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 i(@NotNull String str, @Nullable String str2, @Nullable e6 e6Var, @NotNull w1 w1Var) {
        return R();
    }

    @Override // io.sentry.p1
    public boolean isFinished() {
        return false;
    }

    @Override // io.sentry.p1
    @NotNull
    public p1 k(@NotNull String str, @Nullable String str2, @NotNull w9 w9Var) {
        return R();
    }

    @Override // io.sentry.p1
    @NotNull
    public p9 m() {
        return new p9(io.sentry.protocol.v.f306474b, v9.f307008b, "op", null, null);
    }

    @Override // io.sentry.p1
    public void n(@Nullable x9 x9Var, @Nullable e6 e6Var) {
    }

    @Override // io.sentry.p1
    public boolean n0() {
        return true;
    }

    @Override // io.sentry.p1
    @Nullable
    public fa o() {
        return null;
    }

    @Override // io.sentry.p1
    public void p(@NotNull String str) {
    }

    @Override // io.sentry.p1
    @NotNull
    public io.sentry.protocol.c q() {
        return new io.sentry.protocol.c();
    }

    @Override // io.sentry.p1
    @NotNull
    public m1 q0() {
        return j3.a();
    }

    @Override // io.sentry.p1
    @Nullable
    public x9 t() {
        return null;
    }

    @Override // io.sentry.p1
    public void u() {
    }

    @Override // io.sentry.p1
    @Nullable
    public String v(@Nullable String str) {
        return null;
    }

    @Override // io.sentry.p1
    public void w(@Nullable String str) {
    }

    @Override // io.sentry.p1
    public void y(@NotNull String str, @NotNull Number number) {
    }
}
