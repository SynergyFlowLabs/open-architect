package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n381#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
public final class f implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f87570c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f87571d = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<MemoryCache.Key, ArrayList<b>> f87572a = new LinkedHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f87573b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @l1
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f87574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<Bitmap> f87575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f87576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f87577d;

        public b(int i10, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i11) {
            this.f87574a = i10;
            this.f87575b = weakReference;
            this.f87576c = map;
            this.f87577d = i11;
        }

        @NotNull
        public final WeakReference<Bitmap> a() {
            return this.f87575b;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f87576c;
        }

        public final int c() {
            return this.f87574a;
        }

        public final int d() {
            return this.f87577d;
        }
    }

    private final void g() {
        int i10 = this.f87573b;
        this.f87573b = i10 + 1;
        if (i10 >= 10) {
            f();
        }
    }

    @l1
    public static /* synthetic */ void i() {
    }

    @Override // coil.memory.h
    public synchronized void a(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<b>> linkedHashMap = this.f87572a;
            ArrayList<b> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<b> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            b bVar = new b(iIdentityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList2.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    arrayList2.add(bVar);
                    break;
                }
                b bVar2 = arrayList2.get(i11);
                if (i10 >= bVar2.d()) {
                    if (bVar2.c() != iIdentityHashCode || bVar2.a().get() != bitmap) {
                        arrayList2.add(i11, bVar);
                        break;
                    } else {
                        arrayList2.set(i11, bVar);
                        break;
                    }
                }
                i11++;
            }
            g();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // coil.memory.h
    public synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            try {
                f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // coil.memory.h
    public synchronized void c() {
        this.f87573b = 0;
        this.f87572a.clear();
    }

    @Override // coil.memory.h
    public synchronized boolean d(@NotNull MemoryCache.Key key) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f87572a.remove(key) != null;
    }

    @Override // coil.memory.h
    @Nullable
    public synchronized MemoryCache.b e(@NotNull MemoryCache.Key key) {
        try {
            ArrayList<b> arrayList = this.f87572a.get(key);
            MemoryCache.b bVar = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar2 = arrayList.get(i10);
                Bitmap bitmap = bVar2.a().get();
                MemoryCache.b bVar3 = bitmap != null ? new MemoryCache.b(bitmap, bVar2.b()) : null;
                if (bVar3 != null) {
                    bVar = bVar3;
                    break;
                }
            }
            g();
            return bVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @l1
    public final void f() {
        WeakReference<Bitmap> weakReferenceA;
        this.f87573b = 0;
        Iterator<ArrayList<b>> it = this.f87572a.values().iterator();
        while (it.hasNext()) {
            ArrayList<b> next = it.next();
            if (next.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull((List) next);
                if (((bVar == null || (weakReferenceA = bVar.a()) == null) ? null : weakReferenceA.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (next.get(i12).a().get() == null) {
                        next.remove(i12);
                        i10++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<b>> h() {
        return this.f87572a;
    }

    @Override // coil.memory.h
    @NotNull
    public synchronized Set<MemoryCache.Key> r() {
        return CollectionsKt.toSet(this.f87572a.keySet());
    }
}
