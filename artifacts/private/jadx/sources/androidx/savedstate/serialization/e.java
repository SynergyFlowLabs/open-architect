package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,67:1\n194#2:68\n194#2:69\n194#2:70\n194#2:71\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n*L\n42#1:68\n45#1:69\n52#1:70\n55#1:71\n*E\n"})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75178a = new kotlinx.serialization.p(j1.d(CharSequence.class)).getDescriptor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75179b = new kotlinx.serialization.p(j1.d(Parcelable.class)).getDescriptor();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75180c = new kotlinx.serialization.p(j1.d(Serializable.class)).getDescriptor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75181d = new kotlinx.serialization.p(j1.d(IBinder.class)).getDescriptor();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75188k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final SerialDescriptor f75192o;

    static {
        androidx.savedstate.serialization.serializers.f fVar = androidx.savedstate.serialization.serializers.f.f75232b;
        f75182e = hk.a.a(j1.d(Parcelable.class), fVar).getDescriptor();
        f75183f = hk.a.a(j1.d(Parcelable.class), new kotlinx.serialization.p(j1.d(Parcelable.class))).getDescriptor();
        f75184g = hk.a.i(fVar).getDescriptor();
        f75185h = hk.a.i(new kotlinx.serialization.p(j1.d(Parcelable.class))).getDescriptor();
        androidx.savedstate.serialization.serializers.d dVar = androidx.savedstate.serialization.serializers.d.f75229a;
        f75186i = hk.a.a(j1.d(CharSequence.class), dVar).getDescriptor();
        f75187j = hk.a.a(j1.d(CharSequence.class), new kotlinx.serialization.p(j1.d(CharSequence.class))).getDescriptor();
        f75188k = hk.a.i(dVar).getDescriptor();
        f75189l = hk.a.i(new kotlinx.serialization.p(j1.d(CharSequence.class))).getDescriptor();
        f75190m = new SparseArraySerializer(fVar).getDescriptor();
        f75191n = new SparseArraySerializer(new kotlinx.serialization.p(j1.d(Parcelable.class))).getDescriptor();
        f75192o = new SparseArraySerializer(hk.a.v(new kotlinx.serialization.p(j1.d(Parcelable.class)))).getDescriptor();
    }

    @NotNull
    public static final SerialDescriptor a() {
        return f75186i;
    }

    public static /* synthetic */ void b() {
    }

    @NotNull
    public static final SerialDescriptor c() {
        return f75188k;
    }

    @NotNull
    public static final SerialDescriptor d() {
        return f75192o;
    }

    @NotNull
    public static final SerialDescriptor e() {
        return f75182e;
    }

    public static /* synthetic */ void f() {
    }

    @NotNull
    public static final SerialDescriptor g() {
        return f75184g;
    }

    @NotNull
    public static final SerialDescriptor h() {
        return f75187j;
    }

    public static /* synthetic */ void i() {
    }

    @NotNull
    public static final SerialDescriptor j() {
        return f75178a;
    }

    @NotNull
    public static final SerialDescriptor k() {
        return f75189l;
    }

    @NotNull
    public static final SerialDescriptor l() {
        return f75181d;
    }

    @NotNull
    public static final SerialDescriptor m() {
        return f75180c;
    }

    @NotNull
    public static final SerialDescriptor n() {
        return f75183f;
    }

    public static /* synthetic */ void o() {
    }

    @NotNull
    public static final SerialDescriptor p() {
        return f75179b;
    }

    @NotNull
    public static final SerialDescriptor q() {
        return f75185h;
    }

    @NotNull
    public static final SerialDescriptor r() {
        return f75191n;
    }

    @NotNull
    public static final SerialDescriptor s() {
        return f75190m;
    }
}
