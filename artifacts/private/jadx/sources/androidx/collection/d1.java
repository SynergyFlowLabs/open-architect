package androidx.collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n59#2,5:357\n59#2,5:362\n45#2,5:382\n45#2,5:390\n26#3,2:367\n26#3,2:370\n26#3,2:373\n26#3,2:376\n26#3,2:379\n26#3,2:387\n26#3,2:395\n26#3,2:398\n26#3,2:401\n26#3,2:404\n26#3,2:407\n26#3,2:410\n26#3,2:413\n26#3,2:416\n26#3,2:421\n26#4:369\n26#4:372\n26#4:375\n26#4:378\n26#4:381\n26#4:389\n26#4:397\n26#4:400\n26#4:403\n26#4:406\n26#4:409\n26#4:412\n26#4:415\n26#4:418\n26#4:423\n1855#5,2:419\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n62#1:357,5\n83#1:362,5\n170#1:382,5\n245#1:390,5\n85#1:367,2\n96#1:370,2\n113#1:373,2\n140#1:376,2\n169#1:379,2\n198#1:387,2\n267#1:395,2\n274#1:398,2\n277#1:401,2\n280#1:404,2\n283#1:407,2\n286#1:410,2\n289#1:413,2\n298#1:416,2\n306#1:421,2\n85#1:369\n96#1:372\n113#1:375\n140#1:378\n169#1:381\n198#1:389\n267#1:397\n274#1:400\n277#1:403\n280#1:406\n283#1:409\n286#1:412\n289#1:415\n298#1:418\n306#1:423\n300#1:419,2\n*E\n"})
public class d1<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final t.d<K, V> f12177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final t.b f12178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f12179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f12180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f12182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f12183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f12184i;

    public d1(@androidx.annotation.g0(from = 1, to = g3.f12256c) int i10) {
        this.f12176a = i10;
        if (!(i10 > 0)) {
            t.f.c("maxSize <= 0");
        }
        this.f12177b = new t.d<>(0, 0.75f);
        this.f12178c = new t.b();
    }

    private final int n(K k10, V v10) {
        int iP = p(k10, v10);
        if (!(iP >= 0)) {
            t.f.d("Negative size: " + k10 + '=' + v10);
        }
        return iP;
    }

    @Nullable
    protected V a(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    public final int b() {
        int i10;
        synchronized (this.f12178c) {
            try {
                i10 = this.f12181f;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    protected void c(boolean z10, @NotNull K key, @NotNull V oldValue, @Nullable V v10) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final void d() {
        r(-1);
    }

    public final int e() {
        int i10;
        synchronized (this.f12178c) {
            try {
                i10 = this.f12182g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final V f(@NotNull K key) {
        V v10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f12178c) {
            try {
                V vA = this.f12177b.a(key);
                if (vA != null) {
                    this.f12183h++;
                    return vA;
                }
                this.f12184i++;
                V vA2 = a(key);
                if (vA2 == null) {
                    return null;
                }
                synchronized (this.f12178c) {
                    try {
                        this.f12181f++;
                        v10 = (V) this.f12177b.d(key, vA2);
                        if (v10 != null) {
                            this.f12177b.d(key, v10);
                        } else {
                            this.f12179d += n(key, vA2);
                            Unit unit = Unit.f312394a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (v10 != null) {
                    c(false, key, vA2, v10);
                    return v10;
                }
                r(this.f12176a);
                return vA2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final int g() {
        int i10;
        synchronized (this.f12178c) {
            try {
                i10 = this.f12183h;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final int h() {
        int i10;
        synchronized (this.f12178c) {
            try {
                i10 = this.f12176a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public final int i() {
        int i10;
        synchronized (this.f12178c) {
            i10 = this.f12184i;
        }
        return i10;
    }

    @Nullable
    public final V j(@NotNull K key, @NotNull V value) {
        V vD;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f12178c) {
            try {
                this.f12180e++;
                this.f12179d += n(key, value);
                vD = this.f12177b.d(key, value);
                if (vD != null) {
                    this.f12179d -= n(key, vD);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vD != null) {
            c(false, key, vD, value);
        }
        r(this.f12176a);
        return vD;
    }

    public final int k() {
        int i10;
        synchronized (this.f12178c) {
            try {
                i10 = this.f12180e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Nullable
    public final V l(@NotNull K key) {
        V vE;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f12178c) {
            try {
                vE = this.f12177b.e(key);
                if (vE != null) {
                    this.f12179d -= n(key, vE);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vE != null) {
            c(false, key, vE, null);
        }
        return vE;
    }

    public void m(@androidx.annotation.g0(from = 1, to = g3.f12256c) int i10) {
        if (!(i10 > 0)) {
            t.f.c("maxSize <= 0");
        }
        synchronized (this.f12178c) {
            try {
                this.f12176a = i10;
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        r(i10);
    }

    public final int o() {
        int i10;
        synchronized (this.f12178c) {
            i10 = this.f12179d;
        }
        return i10;
    }

    protected int p(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Map<K, V> q() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f12178c) {
            linkedHashMap = new LinkedHashMap(this.f12177b.b().size());
            Iterator<T> it = this.f12177b.b().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void r(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f12178c) {
                try {
                    if (!(this.f12179d >= 0 && (!this.f12177b.c() || this.f12179d == 0))) {
                        t.f.d("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f12179d <= i10 || this.f12177b.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(this.f12177b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f12177b.e((K) key);
                    this.f12179d -= n(key, value);
                    this.f12182g++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            c(true, key, value, null);
        }
    }

    @NotNull
    public String toString() {
        String str;
        synchronized (this.f12178c) {
            try {
                int i10 = this.f12183h;
                int i11 = this.f12184i + i10;
                str = "LruCache[maxSize=" + this.f12176a + ",hits=" + this.f12183h + ",misses=" + this.f12184i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
