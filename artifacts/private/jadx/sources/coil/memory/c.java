package coil.memory;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.l1;
import coil.j;
import coil.request.i;
import coil.request.n;
import coil.request.q;
import coil.util.k;
import coil.util.l;
import coil.util.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMemoryCacheService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\ncoil/util/-Collections\n+ 4 Logs.kt\ncoil/util/-Logs\n+ 5 Dimension.kt\ncoil/size/-Dimensions\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n*L\n1#1,236:1\n1#2:237\n22#3,4:238\n21#4,4:242\n21#4,4:246\n21#4,4:252\n21#4,4:256\n57#5:250\n57#5:251\n50#6:260\n28#7:261\n*S KotlinDebug\n*F\n+ 1 MemoryCacheService.kt\ncoil/memory/MemoryCacheService\n*L\n62#1:238,4\n93#1:242,4\n116#1:246,4\n166#1:252,4\n176#1:256,4\n137#1:250\n138#1:251\n213#1:260\n213#1:261\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f87553d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f87554e = "MemoryCacheService";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final String f87555f = "coil#transformation_";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f87556g = "coil#transformation_size";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final String f87557h = "coil#is_sampled";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final String f87558i = "coil#disk_cache_key";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j f87559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q f87560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final z f87561c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @l1
        public static /* synthetic */ void a() {
        }

        @l1
        public static /* synthetic */ void b() {
        }

        @l1
        public static /* synthetic */ void c() {
        }

        @l1
        public static /* synthetic */ void d() {
        }

        private a() {
        }
    }

    public c(@NotNull j jVar, @NotNull q qVar, @Nullable z zVar) {
        this.f87559a = jVar;
        this.f87560b = qVar;
        this.f87561c = zVar;
    }

    private final String b(MemoryCache.b bVar) {
        Object obj = bVar.d().get(f87558i);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(MemoryCache.b bVar) {
        Object obj = bVar.d().get(f87557h);
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean e(i iVar, MemoryCache.Key key, MemoryCache.b bVar, coil.size.i iVar2, coil.size.h hVar) {
        double d10;
        String str;
        boolean zD = d(bVar);
        if (coil.size.b.f(iVar2)) {
            if (!zD) {
                return true;
            }
            z zVar = this.f87561c;
            if (zVar != null && zVar.g() <= 3) {
                zVar.h(f87554e, 3, iVar.m() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str2 = key.c().get(f87556g);
        if (str2 != null) {
            return Intrinsics.areEqual(str2, iVar2.toString());
        }
        int width = bVar.c().getWidth();
        int height = bVar.c().getHeight();
        coil.size.c cVarF = iVar2.f();
        int i10 = cVarF instanceof coil.size.c.a ? ((coil.size.c.a) cVarF).f87767a : Integer.MAX_VALUE;
        coil.size.c cVarE = iVar2.e();
        int i11 = cVarE instanceof coil.size.c.a ? ((coil.size.c.a) cVarE).f87767a : Integer.MAX_VALUE;
        double dC = coil.decode.g.c(width, height, i10, i11, hVar);
        boolean zA = k.a(iVar);
        if (!zA) {
            d10 = 1.0d;
            str = f87554e;
            if ((!l.B(i10) && Math.abs(i10 - width) > 1) || (!l.B(i11) && Math.abs(i11 - height) > 1)) {
            }
            return true;
        }
        double dZ = r.z(dC, 1.0d);
        d10 = 1.0d;
        str = f87554e;
        if (Math.abs(((double) i10) - (((double) width) * dZ)) <= 1.0d || Math.abs(((double) i11) - (dZ * ((double) height))) <= 1.0d) {
            return true;
        }
        if (dC != d10 && !zA) {
            z zVar2 = this.f87561c;
            if (zVar2 != null && zVar2.g() <= 3) {
                zVar2.h(str, 3, iVar.m() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + iVar2.f() + ", " + iVar2.e() + ", " + hVar + ").", null);
            }
            return false;
        }
        String str3 = str;
        if (dC > d10 && zD) {
            z zVar3 = this.f87561c;
            if (zVar3 != null && zVar3.g() <= 3) {
                zVar3.h(str3, 3, iVar.m() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + iVar2.f() + ", " + iVar2.e() + ", " + hVar + ").", null);
            }
            return false;
        }
        return true;
    }

    @Nullable
    public final MemoryCache.b a(@NotNull i iVar, @NotNull MemoryCache.Key key, @NotNull coil.size.i iVar2, @NotNull coil.size.h hVar) {
        if (!iVar.C().n()) {
            return null;
        }
        MemoryCache memoryCacheF = this.f87559a.f();
        MemoryCache.b bVarE = memoryCacheF != null ? memoryCacheF.e(key) : null;
        if (bVarE == null || !c(iVar, key, bVarE, iVar2, hVar)) {
            return null;
        }
        return bVarE;
    }

    @l1
    public final boolean c(@NotNull i iVar, @NotNull MemoryCache.Key key, @NotNull MemoryCache.b bVar, @NotNull coil.size.i iVar2, @NotNull coil.size.h hVar) {
        if (this.f87560b.c(iVar, coil.util.a.d(bVar.c()))) {
            return e(iVar, key, bVar, iVar2, hVar);
        }
        z zVar = this.f87561c;
        if (zVar != null && zVar.g() <= 3) {
            zVar.h(f87554e, 3, iVar.m() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        }
        return false;
    }

    @Nullable
    public final MemoryCache.Key f(@NotNull i iVar, @NotNull Object obj, @NotNull n nVar, @NotNull coil.d dVar) {
        MemoryCache.Key keyB = iVar.B();
        if (keyB != null) {
            return keyB;
        }
        dVar.i(iVar, obj);
        String strF = this.f87559a.getComponents().f(obj, nVar);
        dVar.a(iVar, strF);
        if (strF == null) {
            return null;
        }
        List<q4.e> listO = iVar.O();
        Map<String, String> mapK = iVar.E().k();
        if (listO.isEmpty() && mapK.isEmpty()) {
            return new MemoryCache.Key(strF, null, 2, null);
        }
        Map mutableMap = MapsKt.toMutableMap(mapK);
        if (!listO.isEmpty()) {
            List<q4.e> listO2 = iVar.O();
            int size = listO2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mutableMap.put(f87555f + i10, listO2.get(i10).getCacheKey());
            }
            mutableMap.put(f87556g, nVar.p().toString());
        }
        return new MemoryCache.Key(strF, mutableMap);
    }

    @NotNull
    public final coil.request.r g(@NotNull coil.intercept.b.a aVar, @NotNull i iVar, @NotNull MemoryCache.Key key, @NotNull MemoryCache.b bVar) {
        return new coil.request.r(new BitmapDrawable(iVar.l().getResources(), bVar.c()), iVar, coil.decode.e.MEMORY_CACHE, key, b(bVar), d(bVar), l.C(aVar));
    }

    public final boolean h(@Nullable MemoryCache.Key key, @NotNull i iVar, @NotNull coil.intercept.a.b bVar) {
        MemoryCache memoryCacheF;
        Bitmap bitmap;
        if (iVar.C().o() && (memoryCacheF = this.f87559a.f()) != null && key != null) {
            Drawable drawableE = bVar.e();
            BitmapDrawable bitmapDrawable = drawableE instanceof BitmapDrawable ? (BitmapDrawable) drawableE : null;
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(f87557h, Boolean.valueOf(bVar.f()));
                String strD = bVar.d();
                if (strD != null) {
                    linkedHashMap.put(f87558i, strD);
                }
                memoryCacheF.f(key, new MemoryCache.b(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
