package androidx.savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@oj.g
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Bundle f75162a;

    @a1
    private /* synthetic */ n(Bundle bundle) {
        this.f75162a = bundle;
    }

    public static final <T extends Parcelable> void A(Bundle bundle, @NotNull String key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelable(key, value);
    }

    public static final <T extends Parcelable> void B(Bundle bundle, @NotNull String key, @NotNull T[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArray(key, value);
    }

    public static final <T extends Parcelable> void C(Bundle bundle, @NotNull String key, @NotNull List<? extends T> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putParcelableArrayList(key, o.a(value));
    }

    public static final void D(Bundle bundle, @NotNull String key, @NotNull Bundle value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBundle(key, value);
    }

    public static final void E(Bundle bundle, @NotNull String key, @NotNull Bundle[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        B(bundle, key, value);
    }

    public static final void F(Bundle bundle, @NotNull String key, @NotNull List<Bundle> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        C(bundle, key, value);
    }

    public static final void G(Bundle bundle, @NotNull String key, @NotNull Size value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSize(key, value);
    }

    public static final void H(Bundle bundle, @NotNull String key, @NotNull SizeF value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSizeF(key, value);
    }

    public static final <T extends Parcelable> void I(Bundle bundle, @NotNull String key, @NotNull SparseArray<T> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSparseParcelableArray(key, value);
    }

    public static final void J(Bundle bundle, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putString(key, value);
    }

    public static final void K(Bundle bundle, @NotNull String key, @NotNull String[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArray(key, value);
    }

    public static final void L(Bundle bundle, @NotNull String key, @NotNull List<String> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putStringArrayList(key, o.a(value));
    }

    public static final void M(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.remove(key);
    }

    public static String N(Bundle bundle) {
        return "SavedStateWriter(source=" + bundle + ')';
    }

    public static final /* synthetic */ n a(Bundle bundle) {
        return new n(bundle);
    }

    public static final void b(Bundle bundle) {
        bundle.clear();
    }

    @a1
    @NotNull
    public static Bundle c(@NotNull Bundle source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return source;
    }

    public static boolean d(Bundle bundle, Object obj) {
        return (obj instanceof n) && Intrinsics.areEqual(bundle, ((n) obj).O());
    }

    public static final boolean e(Bundle bundle, Bundle bundle2) {
        return Intrinsics.areEqual(bundle, bundle2);
    }

    public static int f(Bundle bundle) {
        return bundle.hashCode();
    }

    public static final void g(Bundle bundle, @NotNull Bundle from) {
        Intrinsics.checkNotNullParameter(from, "from");
        bundle.putAll(from);
    }

    public static final void h(Bundle bundle, @NotNull String key, @NotNull IBinder value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBinder(key, value);
    }

    public static final void i(Bundle bundle, @NotNull String key, boolean z10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBoolean(key, z10);
    }

    public static final void j(Bundle bundle, @NotNull String key, @NotNull boolean[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putBooleanArray(key, value);
    }

    public static final void k(Bundle bundle, @NotNull String key, char c10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putChar(key, c10);
    }

    public static final void l(Bundle bundle, @NotNull String key, @NotNull char[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharArray(key, value);
    }

    public static final void m(Bundle bundle, @NotNull String key, @NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequence(key, value);
    }

    public static final void n(Bundle bundle, @NotNull String key, @NotNull CharSequence[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArray(key, value);
    }

    public static final void o(Bundle bundle, @NotNull String key, @NotNull List<? extends CharSequence> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putCharSequenceArrayList(key, o.a(value));
    }

    public static final void p(Bundle bundle, @NotNull String key, double d10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putDouble(key, d10);
    }

    public static final void q(Bundle bundle, @NotNull String key, @NotNull double[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putDoubleArray(key, value);
    }

    public static final void r(Bundle bundle, @NotNull String key, float f10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putFloat(key, f10);
    }

    public static final void s(Bundle bundle, @NotNull String key, @NotNull float[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putFloatArray(key, value);
    }

    public static final void t(Bundle bundle, @NotNull String key, int i10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putInt(key, i10);
    }

    public static final void u(Bundle bundle, @NotNull String key, @NotNull int[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntArray(key, value);
    }

    public static final void v(Bundle bundle, @NotNull String key, @NotNull List<Integer> value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putIntegerArrayList(key, o.a(value));
    }

    public static final <T extends Serializable> void w(Bundle bundle, @NotNull String key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putSerializable(key, value);
    }

    public static final void x(Bundle bundle, @NotNull String key, long j10) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putLong(key, j10);
    }

    public static final void y(Bundle bundle, @NotNull String key, @NotNull long[] value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        bundle.putLongArray(key, value);
    }

    public static final void z(Bundle bundle, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        bundle.putString(key, null);
    }

    public final /* synthetic */ Bundle O() {
        return this.f75162a;
    }

    public boolean equals(Object obj) {
        return d(this.f75162a, obj);
    }

    public int hashCode() {
        return f(this.f75162a);
    }

    public String toString() {
        return N(this.f75162a);
    }
}
