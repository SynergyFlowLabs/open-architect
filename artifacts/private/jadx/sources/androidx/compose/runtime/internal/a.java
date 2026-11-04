package androidx.compose.runtime.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class a extends AtomicInteger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f35890a = 8;

    public a(int i10) {
        super(i10);
    }

    public final int a(int i10) {
        return addAndGet(i10);
    }

    public byte b() {
        return (byte) intValue();
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        return b();
    }

    @kotlin.l(message = "Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.\nIf you override toChar() function in your Number inheritor, it's recommended to gradually deprecate the overriding function and then remove it.\nSee https://youtrack.jetbrains.com/issue/KT-46465 for details about the migration", replaceWith = @kotlin.b1(expression = "this.toInt().toChar()", imports = {}))
    public char c() {
        return (char) intValue();
    }

    public /* bridge */ double d() {
        return super.doubleValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ double doubleValue() {
        return d();
    }

    public /* bridge */ float e() {
        return super.floatValue();
    }

    public /* bridge */ int f() {
        return super.intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ float floatValue() {
        return e();
    }

    public /* bridge */ long g() {
        return super.longValue();
    }

    public short h() {
        return (short) intValue();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ int intValue() {
        return f();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger, java.lang.Number
    public final /* bridge */ long longValue() {
        return g();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        return h();
    }
}
