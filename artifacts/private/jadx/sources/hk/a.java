package hk;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.e2;
import kotlin.f2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n1;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q1;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.z;
import kotlin.r1;
import kotlin.time.c;
import kotlin.u;
import kotlin.u1;
import kotlin.uuid.d;
import kotlin.y1;
import kotlin.z1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.g;
import kotlinx.serialization.internal.a3;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.d0;
import kotlinx.serialization.internal.e0;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.f;
import kotlinx.serialization.internal.f0;
import kotlinx.serialization.internal.g1;
import kotlinx.serialization.internal.h;
import kotlinx.serialization.internal.i;
import kotlinx.serialization.internal.i3;
import kotlinx.serialization.internal.k;
import kotlinx.serialization.internal.k1;
import kotlinx.serialization.internal.l;
import kotlinx.serialization.internal.l3;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.m3;
import kotlinx.serialization.internal.n0;
import kotlinx.serialization.internal.o0;
import kotlinx.serialization.internal.o3;
import kotlinx.serialization.internal.p3;
import kotlinx.serialization.internal.q;
import kotlinx.serialization.internal.r3;
import kotlinx.serialization.internal.s3;
import kotlinx.serialization.internal.t2;
import kotlinx.serialization.internal.u3;
import kotlinx.serialization.internal.v1;
import kotlinx.serialization.internal.v3;
import kotlinx.serialization.internal.w1;
import kotlinx.serialization.internal.w3;
import kotlinx.serialization.internal.x0;
import kotlinx.serialization.internal.x3;
import kotlinx.serialization.internal.y0;
import kotlinx.serialization.internal.z2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    @NotNull
    public static final KSerializer<e2> A(@NotNull e2.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return v3.f316035a;
    }

    @NotNull
    public static final KSerializer<Unit> B(@NotNull Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<this>");
        return w3.f316047b;
    }

    @NotNull
    public static final KSerializer<Boolean> C(@NotNull m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return i.f315935a;
    }

    @NotNull
    public static final KSerializer<Byte> D(@NotNull o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        return l.f315963a;
    }

    @NotNull
    public static final KSerializer<Character> E(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return kotlinx.serialization.internal.r.f316001a;
    }

    @NotNull
    public static final KSerializer<Double> F(@NotNull w wVar) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        return e0.f315908a;
    }

    @NotNull
    public static final KSerializer<Float> G(@NotNull z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return o0.f315985a;
    }

    @NotNull
    public static final KSerializer<Integer> H(@NotNull i0 i0Var) {
        Intrinsics.checkNotNullParameter(i0Var, "<this>");
        return y0.f316055a;
    }

    @NotNull
    public static final KSerializer<Long> I(@NotNull kotlin.jvm.internal.o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        return k1.f315958a;
    }

    @NotNull
    public static final KSerializer<Short> J(@NotNull n1 n1Var) {
        Intrinsics.checkNotNullParameter(n1Var, "<this>");
        return a3.f315893a;
    }

    @NotNull
    public static final KSerializer<String> K(@NotNull q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        return b3.f315897a;
    }

    @NotNull
    public static final KSerializer<c> L(@NotNull c.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return f0.f315915a;
    }

    @kotlin.uuid.a
    @NotNull
    public static final KSerializer<d> M(@NotNull d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return x3.f316053a;
    }

    @g
    @NotNull
    public static final <T, E extends T> KSerializer<E[]> a(@NotNull kotlin.reflect.d<T> kClass, @NotNull KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new t2(kClass, elementSerializer);
    }

    @g
    public static final /* synthetic */ <T, E extends T> KSerializer<E[]> b(KSerializer<E> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
        return a(j1.d(Object.class), elementSerializer);
    }

    @NotNull
    public static final KSerializer<boolean[]> c() {
        return h.f315927c;
    }

    @NotNull
    public static final KSerializer<byte[]> d() {
        return k.f315954c;
    }

    @NotNull
    public static final KSerializer<char[]> e() {
        return q.f315997c;
    }

    @NotNull
    public static final KSerializer<double[]> f() {
        return d0.f315904c;
    }

    @NotNull
    public static final KSerializer<float[]> g() {
        return n0.f315977c;
    }

    @NotNull
    public static final KSerializer<int[]> h() {
        return x0.f316050c;
    }

    @NotNull
    public static final <T> KSerializer<List<T>> i(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new f(elementSerializer);
    }

    @NotNull
    public static final KSerializer<long[]> j() {
        return kotlinx.serialization.internal.j1.f315950c;
    }

    @NotNull
    public static final <K, V> KSerializer<Map.Entry<K, V>> k(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new m1(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <K, V> KSerializer<Map<K, V>> l(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new e1(keySerializer, valueSerializer);
    }

    @g
    @NotNull
    public static final KSerializer m() {
        return v1.f316033a;
    }

    @NotNull
    public static final <K, V> KSerializer<Pair<K, V>> n(@NotNull KSerializer<K> keySerializer, @NotNull KSerializer<V> valueSerializer) {
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        return new b2(keySerializer, valueSerializer);
    }

    @NotNull
    public static final <T> KSerializer<Set<T>> o(@NotNull KSerializer<T> elementSerializer) {
        Intrinsics.checkNotNullParameter(elementSerializer, "elementSerializer");
        return new g1(elementSerializer);
    }

    @NotNull
    public static final KSerializer<short[]> p() {
        return z2.f316067c;
    }

    @NotNull
    public static final <A, B, C> KSerializer<kotlin.n1<A, B, C>> q(@NotNull KSerializer<A> aSerializer, @NotNull KSerializer<B> bSerializer, @NotNull KSerializer<C> cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        return new i3(aSerializer, bSerializer, cSerializer);
    }

    @u
    @g
    @NotNull
    public static final KSerializer<r1> r() {
        return l3.f315967c;
    }

    @u
    @g
    @NotNull
    public static final KSerializer<kotlin.v1> s() {
        return o3.f315990c;
    }

    @u
    @g
    @NotNull
    public static final KSerializer<z1> t() {
        return r3.f316006c;
    }

    @u
    @g
    @NotNull
    public static final KSerializer<f2> u() {
        return u3.f316030c;
    }

    @NotNull
    public static final <T> KSerializer<T> v(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        return kSerializer.getDescriptor().isNullable() ? kSerializer : new w1(kSerializer);
    }

    public static /* synthetic */ void w(KSerializer kSerializer) {
    }

    @NotNull
    public static final KSerializer<kotlin.q1> x(@NotNull kotlin.q1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return m3.f315975a;
    }

    @NotNull
    public static final KSerializer<u1> y(@NotNull u1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return p3.f315995a;
    }

    @NotNull
    public static final KSerializer<y1> z(@NotNull y1.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return s3.f316008a;
    }
}
