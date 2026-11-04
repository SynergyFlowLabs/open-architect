package app.rive.runtime.kotlin.fonts;

import androidx.annotation.l1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FontHelper {

    @NotNull
    private static final String TAG = "FontHelper";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final AtomicReference<Map<String, Fonts.Family>> fontCache = new AtomicReference<>(null);

    @SourceDebugExtension({"SMAP\nFontHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/FontHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1017:1\n1#2:1018\n183#3,2:1019\n1317#3,2:1022\n2707#3,4:1025\n2711#3,6:1032\n183#3,2:1040\n1863#4:1021\n1864#4:1024\n2632#4,3:1029\n1062#4:1038\n1062#4:1039\n1246#4,2:1045\n774#4:1047\n865#4,2:1048\n1249#4:1050\n216#5:1042\n217#5:1058\n462#6:1043\n412#6:1044\n503#6,7:1051\n*S KotlinDebug\n*F\n+ 1 FontHelpers.kt\napp/rive/runtime/kotlin/fonts/FontHelper$Companion\n*L\n150#1:1019,2\n229#1:1022,2\n276#1:1025,4\n276#1:1032,6\n327#1:1040,2\n220#1:1021\n220#1:1024\n282#1:1029,3\n291#1:1038\n292#1:1039\n351#1:1045,2\n352#1:1047\n352#1:1048,2\n351#1:1050\n348#1:1042\n348#1:1058\n351#1:1043\n351#1:1044\n354#1:1051,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void filterFamilies(List<Fonts.Family> list, Set<Fonts.Font> set, Fonts.Weight weight, String str) {
            Sequence<Fonts.Font> sequenceG;
            for (Fonts.Family family : list) {
                if (weight == null) {
                    sequenceG = o.k(CollectionsKt.asSequence(family.getFonts().values()));
                } else {
                    List<Fonts.Font> list2 = family.getFonts().get(weight);
                    if (list2 == null || (sequenceG = CollectionsKt.asSequence(list2)) == null) {
                        sequenceG = o.g();
                    }
                }
                for (Fonts.Font font : sequenceG) {
                    if (str == null || StringsKt.w3(str) || Intrinsics.areEqual(font.getStyle(), str)) {
                        set.add(font);
                    }
                }
            }
        }

        private final Map<String, Fonts.Family> filterNonExistingFonts(Map<String, Fonts.Family> map) {
            if (map.isEmpty()) {
                return map;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Fonts.Family> entry : map.entrySet()) {
                String key = entry.getKey();
                Fonts.Family value = entry.getValue();
                Map<Fonts.Weight, List<Fonts.Font>> fonts = value.getFonts();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(fonts.size()));
                Iterator<T> it = fonts.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    Object key2 = entry2.getKey();
                    List list = (List) entry2.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (FontHelper.Companion.getFontFile((Fonts.Font) obj) != null) {
                            arrayList.add(obj);
                        }
                    }
                    linkedHashMap2.put(key2, arrayList);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    if (!((List) entry3.getValue()).isEmpty()) {
                        linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                    }
                }
                if (!linkedHashMap3.isEmpty()) {
                    linkedHashMap.put(key, new Fonts.Family(key, value.getVariant(), value.getLang(), linkedHashMap3));
                }
            }
            return linkedHashMap;
        }

        public static /* synthetic */ List findMatches$kotlin_release$default(Companion companion, Map map, Fonts.FontOpts fontOpts, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.findMatches$kotlin_release(map, fontOpts);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean findMatches$lambda$8(String str, String str2, Map.Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "<destruct>");
            String str3 = (String) entry.getKey();
            Fonts.Family family = (Fonts.Family) entry.getValue();
            if ((str != null && !StringsKt.N1(str3, str, true)) || (str2 != null && !Intrinsics.areEqual(family.getLang(), str2))) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Fonts.Family findMatches$lambda$9(Map.Entry it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (Fonts.Family) it.getValue();
        }

        public static /* synthetic */ Fonts.Font getFallbackFont$default(Companion companion, Fonts.FontOpts fontOpts, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFont(fontOpts);
        }

        public static /* synthetic */ byte[] getFallbackFontBytes$default(Companion companion, Fonts.FontOpts fontOpts, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fontOpts = null;
            }
            return companion.getFallbackFontBytes(fontOpts);
        }

        public static /* synthetic */ List getFallbackFonts$default(Companion companion, Fonts.FontOpts fontOpts, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return companion.getFallbackFonts(fontOpts);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File getFontFile$lambda$14(Fonts.Font font, String basePath) {
            Intrinsics.checkNotNullParameter(basePath, "basePath");
            return new File(basePath, StringsKt.E5(font.getName()).toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final File loadFonts$lambda$2(String pathStr) {
            Intrinsics.checkNotNullParameter(pathStr, "pathStr");
            return new File(pathStr);
        }

        @NotNull
        public final List<Fonts.Font> findMatches$kotlin_release(@NotNull Map<String, Fonts.Family> fontFamilies, @NotNull Fonts.FontOpts opts) {
            Intrinsics.checkNotNullParameter(fontFamilies, "fontFamilies");
            Intrinsics.checkNotNullParameter(opts, "opts");
            final String familyName = opts.getFamilyName();
            final String lang = opts.getLang();
            Fonts.Weight weight = opts.getWeight();
            String style = opts.getStyle();
            Sequence sequenceK1 = o.k1(o.p0(MapsKt.asSequence(fontFamilies), new Function1() { // from class: app.rive.runtime.kotlin.fonts.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FontHelper.Companion.findMatches$lambda$8(familyName, lang, (Map.Entry) obj));
                }
            }), new Function1() { // from class: app.rive.runtime.kotlin.fonts.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.findMatches$lambda$9((Map.Entry) obj);
                }
            });
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : sequenceK1) {
                Fonts.Family family = (Fonts.Family) obj;
                String name = family.getName();
                if (name != null && !StringsKt.w3(name)) {
                    List listFlatten = CollectionsKt.flatten(family.getFonts().values());
                    if (!(listFlatten instanceof Collection) || !listFlatten.isEmpty()) {
                        Iterator it = listFlatten.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.areEqual(name, ((Fonts.Font) it.next()).getName())) {
                                }
                            }
                        }
                    }
                    arrayList.add(obj);
                }
                arrayList2.add(obj);
            }
            Pair pair = new Pair(arrayList, arrayList2);
            List list = (List) pair.component1();
            List list2 = (List) pair.component2();
            List<Fonts.Family> listSortedWith = CollectionsKt.sortedWith(list, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$findMatches$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return kotlin.comparisons.a.l(Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t11).getLang(), lang)), Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t10).getLang(), lang)));
                }
            });
            List<Fonts.Family> listSortedWith2 = CollectionsKt.sortedWith(list2, new Comparator() { // from class: app.rive.runtime.kotlin.fonts.FontHelper$Companion$findMatches$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return kotlin.comparisons.a.l(Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t11).getLang(), lang)), Boolean.valueOf(Intrinsics.areEqual(((Fonts.Family) t10).getLang(), lang)));
                }
            });
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            filterFamilies(listSortedWith, linkedHashSet, weight, style);
            filterFamilies(listSortedWith2, linkedHashSet, weight, style);
            return CollectionsKt.toList(linkedHashSet);
        }

        @Nullable
        public final Fonts.Font getFallbackFont(@Nullable Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            return (Fonts.Font) CollectionsKt.firstOrNull((List) getFallbackFonts(fontOpts));
        }

        @Nullable
        public final byte[] getFallbackFontBytes(@Nullable Fonts.FontOpts fontOpts) {
            if (fontOpts == null) {
                fontOpts = Fonts.FontOpts.Companion.getDEFAULT();
            }
            Fonts.Font fallbackFont = getFallbackFont(fontOpts);
            if (fallbackFont != null) {
                return FontHelper.Companion.getFontBytes(fallbackFont);
            }
            return null;
        }

        @NotNull
        public final List<Fonts.Font> getFallbackFonts(@NotNull Fonts.FontOpts opts) {
            Intrinsics.checkNotNullParameter(opts, "opts");
            Map<String, Fonts.Family> systemFonts = getSystemFonts();
            return systemFonts.isEmpty() ? CollectionsKt.emptyList() : findMatches$kotlin_release(systemFonts, opts);
        }

        @Nullable
        public final byte[] getFontBytes(@NotNull Fonts.Font font) {
            Intrinsics.checkNotNullParameter(font, "font");
            File fontFile = getFontFile(font);
            if (fontFile != null) {
                return l.x(fontFile);
            }
            return null;
        }

        @Nullable
        public final File getFontFile(@NotNull final Fonts.Font font) {
            Object next;
            Intrinsics.checkNotNullParameter(font, "font");
            Iterator it = o.k1(CollectionsKt.asSequence(SystemFontsParser.Companion.getSYSTEM_FONTS_PATHS$kotlin_release()), new Function1() { // from class: app.rive.runtime.kotlin.fonts.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.getFontFile$lambda$14(font, (String) obj);
                }
            }).iterator();
            while (it.hasNext()) {
                next = it.next();
                if (((File) next).exists()) {
                    return (File) next;
                }
            }
            next = null;
            return (File) next;
        }

        @NotNull
        public final Map<String, Fonts.Family> getSystemFonts() {
            Map<String, Fonts.Family> mapLoadFonts$kotlin_release;
            Map<String, Fonts.Family> map = (Map) FontHelper.fontCache.get();
            if (map != null) {
                return map;
            }
            synchronized (this) {
                try {
                    mapLoadFonts$kotlin_release = (Map) FontHelper.fontCache.get();
                    if (mapLoadFonts$kotlin_release == null) {
                        mapLoadFonts$kotlin_release = FontHelper.Companion.loadFonts$kotlin_release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return mapLoadFonts$kotlin_release;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x006a  */
        @NotNull
        public final Map<String, Fonts.Family> loadFonts$kotlin_release() throws IOException {
            Object next;
            Map<String, Fonts.Family> mapEmptyMap;
            Iterator it = o.k1(o.q(SystemFontsParser.FONTS_XML_PATH, SystemFontsParser.SYSTEM_FONTS_XML_PATH, SystemFontsParser.FALLBACK_FONTS_XML_PATH), new Function1() { // from class: app.rive.runtime.kotlin.fonts.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FontHelper.Companion.loadFonts$lambda$2((String) obj);
                }
            }).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((File) next).exists());
            File file = (File) next;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    try {
                        mapEmptyMap = SystemFontsParser.Companion.parseFontsXML$kotlin_release(fileInputStream);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.c.a(fileInputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Exception e10) {
                    e10.getMessage();
                    mapEmptyMap = MapsKt.emptyMap();
                }
                kotlin.io.c.a(fileInputStream, null);
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
            } else {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Map<String, Fonts.Family> mapFilterNonExistingFonts = filterNonExistingFonts(mapEmptyMap);
            FontHelper.fontCache.set(mapFilterNonExistingFonts);
            return mapFilterNonExistingFonts;
        }

        @l1
        public final void resetForTesting() {
            FontHelper.fontCache.set(null);
        }

        private Companion() {
        }
    }
}
