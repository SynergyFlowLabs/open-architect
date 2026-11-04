package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@w0(19)
public class o implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f96425d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f96426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f96427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f96428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f96429h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Bitmap.Config[] f96430i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f96431a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<b, Bitmap> f96432b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f96433c = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f96434a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f96434a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f96434a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f96434a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f96434a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @l1
    static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i10, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f96426e = configArr;
        f96427f = configArr;
        f96428g = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f96429h = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f96430i = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void d(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
    }

    private b g(int i10, Bitmap.Config config) {
        b bVarE = this.f96431a.e(i10, config);
        boolean z10 = false;
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i10 * 8) {
                if (numCeilingKey.intValue() == i10 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f96431a.c(bVarE);
                return this.f96431a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f96427f;
        }
        int i10 = a.f96434a[config.ordinal()];
        if (i10 == 1) {
            return f96426e;
        }
        if (i10 == 2) {
            return f96428g;
        }
        if (i10 != 3) {
            return i10 != 4 ? new Bitmap.Config[]{config} : f96430i;
        }
        return f96429h;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> treeMap = this.f96433c.get(config);
        if (treeMap == null) {
            treeMap = new TreeMap<>();
            this.f96433c.put(config, treeMap);
        }
        return treeMap;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String a(int i10, int i11, Bitmap.Config config) {
        return h(com.bumptech.glide.util.m.g(i10, i11, config), config);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public int b(Bitmap bitmap) {
        return com.bumptech.glide.util.m.h(bitmap);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public String c(Bitmap bitmap) {
        return h(com.bumptech.glide.util.m.h(bitmap), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    public void e(Bitmap bitmap) {
        b bVarE = this.f96431a.e(com.bumptech.glide.util.m.h(bitmap), bitmap.getConfig());
        this.f96432b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f96436b));
        navigableMapJ.put(Integer.valueOf(bVarE.f96436b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        b bVarG = g(com.bumptech.glide.util.m.g(i10, i11, config), config);
        Bitmap bitmapA = this.f96432b.a(bVarG);
        if (bitmapA != null) {
            d(Integer.valueOf(bVarG.f96436b), bitmapA);
            bitmapA.reconfigure(i10, i11, config);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.l
    @p0
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f96432b.f();
        if (bitmapF != null) {
            d(Integer.valueOf(com.bumptech.glide.util.m.h(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f96432b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f96433c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f96433c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }

    @l1
    static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f96435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f96436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f96437c;

        public b(c cVar) {
            this.f96435a = cVar;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.m
        public void a() {
            this.f96435a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f96436b = i10;
            this.f96437c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f96436b == bVar.f96436b && com.bumptech.glide.util.m.d(this.f96437c, bVar.f96437c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f96436b * 31;
            Bitmap.Config config = this.f96437c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f96436b, this.f96437c);
        }

        @l1
        b(c cVar, int i10, Bitmap.Config config) {
            this(cVar);
            b(i10, config);
        }
    }
}
