package app.rive.runtime.kotlin.fonts;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.r;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class Fonts {

    public static final class Axis {

        @NotNull
        private final String styleValue;

        @NotNull
        private final String tag;

        public Axis(@NotNull String tag, @NotNull String styleValue) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(styleValue, "styleValue");
            this.tag = tag;
            this.styleValue = styleValue;
        }

        public static /* synthetic */ Axis copy$default(Axis axis, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = axis.tag;
            }
            if ((i10 & 2) != 0) {
                str2 = axis.styleValue;
            }
            return axis.copy(str, str2);
        }

        @NotNull
        public final String component1() {
            return this.tag;
        }

        @NotNull
        public final String component2() {
            return this.styleValue;
        }

        @NotNull
        public final Axis copy(@NotNull String tag, @NotNull String styleValue) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(styleValue, "styleValue");
            return new Axis(tag, styleValue);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Axis)) {
                return false;
            }
            Axis axis = (Axis) obj;
            return Intrinsics.areEqual(this.tag, axis.tag) && Intrinsics.areEqual(this.styleValue, axis.styleValue);
        }

        @NotNull
        public final String getStyleValue() {
            return this.styleValue;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            return (this.tag.hashCode() * 31) + this.styleValue.hashCode();
        }

        @NotNull
        public String toString() {
            return "Axis(tag=" + this.tag + ", styleValue=" + this.styleValue + ')';
        }
    }

    public static final class FontOpts {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final FontOpts DEFAULT = new FontOpts("sans-serif", null, null, null, 14, null);

        @Nullable
        private final String familyName;

        @Nullable
        private final String lang;

        @Nullable
        private final String style;

        @Nullable
        private final Weight weight;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final FontOpts getDEFAULT() {
                return FontOpts.DEFAULT;
            }

            private Companion() {
            }
        }

        public FontOpts() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ FontOpts copy$default(FontOpts fontOpts, String str, String str2, Weight weight, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fontOpts.familyName;
            }
            if ((i10 & 2) != 0) {
                str2 = fontOpts.lang;
            }
            if ((i10 & 4) != 0) {
                weight = fontOpts.weight;
            }
            if ((i10 & 8) != 0) {
                str3 = fontOpts.style;
            }
            return fontOpts.copy(str, str2, weight, str3);
        }

        @Nullable
        public final String component1() {
            return this.familyName;
        }

        @Nullable
        public final String component2() {
            return this.lang;
        }

        @Nullable
        public final Weight component3() {
            return this.weight;
        }

        @Nullable
        public final String component4() {
            return this.style;
        }

        @NotNull
        public final FontOpts copy(@Nullable String str, @Nullable String str2, @Nullable Weight weight, @Nullable String str3) {
            return new FontOpts(str, str2, weight, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FontOpts)) {
                return false;
            }
            FontOpts fontOpts = (FontOpts) obj;
            return Intrinsics.areEqual(this.familyName, fontOpts.familyName) && Intrinsics.areEqual(this.lang, fontOpts.lang) && Intrinsics.areEqual(this.weight, fontOpts.weight) && Intrinsics.areEqual(this.style, fontOpts.style);
        }

        @Nullable
        public final String getFamilyName() {
            return this.familyName;
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        public final String getStyle() {
            return this.style;
        }

        @Nullable
        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            String str = this.familyName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lang;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Weight weight = this.weight;
            int iHashCode3 = (iHashCode2 + (weight == null ? 0 : weight.hashCode())) * 31;
            String str3 = this.style;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FontOpts(familyName=" + this.familyName + ", lang=" + this.lang + ", weight=" + this.weight + ", style=" + this.style + ')';
        }

        public FontOpts(@Nullable String str, @Nullable String str2, @Nullable Weight weight, @Nullable String str3) {
            this.familyName = str;
            this.lang = str2;
            this.weight = weight;
            this.style = str3;
        }

        public /* synthetic */ FontOpts(String str, String str2, Weight weight, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? Weight.Companion.getNORMAL() : weight, (i10 & 8) != 0 ? "normal" : str3);
        }
    }

    public static final class Weight implements Comparable<Weight> {
        private final int weight;

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        private static final Weight NORMAL = new Weight(400);

        @NotNull
        private static final Weight BOLD = new Weight(700);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Weight fromInt$default(Companion companion, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = 400;
                }
                return companion.fromInt(i10);
            }

            @NotNull
            public final Weight fromInt(int i10) {
                return new Weight(r.J(i10, new IntRange(0, 1000)));
            }

            @NotNull
            public final Weight fromString(@Nullable String str) {
                Integer intOrNull;
                return new Weight((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 400 : r.J(intOrNull.intValue(), new IntRange(0, 1000)));
            }

            @NotNull
            public final Weight getBOLD() {
                return Weight.BOLD;
            }

            @NotNull
            public final Weight getNORMAL() {
                return Weight.NORMAL;
            }

            private Companion() {
            }
        }

        public Weight() {
            this(0, 1, null);
        }

        public static /* synthetic */ Weight copy$default(Weight weight, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = weight.weight;
            }
            return weight.copy(i10);
        }

        public final int component1() {
            return this.weight;
        }

        @NotNull
        public final Weight copy(int i10) {
            return new Weight(i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Weight) && this.weight == ((Weight) obj).weight;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Integer.hashCode(this.weight);
        }

        @NotNull
        public String toString() {
            return "Weight(weight=" + this.weight + ')';
        }

        public Weight(int i10) {
            this.weight = i10;
        }

        @Override // java.lang.Comparable
        public int compareTo(@NotNull Weight other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Intrinsics.compare(this.weight, other.weight);
        }

        public /* synthetic */ Weight(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 400 : i10);
        }
    }

    public static final class Alias {

        @NotNull
        private final String name;

        @NotNull
        private final String original;

        @Nullable
        private final Weight weight;

        public Alias(@NotNull String name, @NotNull String original, @Nullable Weight weight) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(original, "original");
            this.name = name;
            this.original = original;
            this.weight = weight;
        }

        public static /* synthetic */ Alias copy$default(Alias alias, String str, String str2, Weight weight, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = alias.name;
            }
            if ((i10 & 2) != 0) {
                str2 = alias.original;
            }
            if ((i10 & 4) != 0) {
                weight = alias.weight;
            }
            return alias.copy(str, str2, weight);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @NotNull
        public final String component2() {
            return this.original;
        }

        @Nullable
        public final Weight component3() {
            return this.weight;
        }

        @NotNull
        public final Alias copy(@NotNull String name, @NotNull String original, @Nullable Weight weight) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(original, "original");
            return new Alias(name, original, weight);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alias)) {
                return false;
            }
            Alias alias = (Alias) obj;
            return Intrinsics.areEqual(this.name, alias.name) && Intrinsics.areEqual(this.original, alias.original) && Intrinsics.areEqual(this.weight, alias.weight);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getOriginal() {
            return this.original;
        }

        @Nullable
        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iHashCode = ((this.name.hashCode() * 31) + this.original.hashCode()) * 31;
            Weight weight = this.weight;
            return iHashCode + (weight == null ? 0 : weight.hashCode());
        }

        @NotNull
        public String toString() {
            return "Alias(name=" + this.name + ", original=" + this.original + ", weight=" + this.weight + ')';
        }

        public /* synthetic */ Alias(String str, String str2, Weight weight, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i10 & 4) != 0 ? Weight.Companion.getNORMAL() : weight);
        }
    }

    public static final class FileFont {

        @Nullable
        private final String lang;

        @NotNull
        private final String name;

        @Nullable
        private final String variant;

        public FileFont(@NotNull String name, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.variant = str;
            this.lang = str2;
        }

        public static /* synthetic */ FileFont copy$default(FileFont fileFont, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fileFont.name;
            }
            if ((i10 & 2) != 0) {
                str2 = fileFont.variant;
            }
            if ((i10 & 4) != 0) {
                str3 = fileFont.lang;
            }
            return fileFont.copy(str, str2, str3);
        }

        @NotNull
        public final String component1() {
            return this.name;
        }

        @Nullable
        public final String component2() {
            return this.variant;
        }

        @Nullable
        public final String component3() {
            return this.lang;
        }

        @NotNull
        public final FileFont copy(@NotNull String name, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new FileFont(name, str, str2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileFont)) {
                return false;
            }
            FileFont fileFont = (FileFont) obj;
            return Intrinsics.areEqual(this.name, fileFont.name) && Intrinsics.areEqual(this.variant, fileFont.variant) && Intrinsics.areEqual(this.lang, fileFont.lang);
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.variant;
            int iHashCode2 = 0;
            int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.lang;
            if (str2 != null) {
                iHashCode2 = str2.hashCode();
            }
            return iHashCode3 + iHashCode2;
        }

        @NotNull
        public String toString() {
            return "FileFont(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ')';
        }

        public /* synthetic */ FileFont(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
        }
    }

    public static final class Family {

        @NotNull
        private final Map<Weight, List<Font>> fonts;

        @Nullable
        private final String lang;

        @Nullable
        private final String name;

        @Nullable
        private final String variant;

        /* JADX WARN: Multi-variable type inference failed */
        public Family(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<Weight, ? extends List<Font>> fonts) {
            Intrinsics.checkNotNullParameter(fonts, "fonts");
            this.name = str;
            this.variant = str2;
            this.lang = str3;
            this.fonts = fonts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Family copy$default(Family family, String str, String str2, String str3, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = family.name;
            }
            if ((i10 & 2) != 0) {
                str2 = family.variant;
            }
            if ((i10 & 4) != 0) {
                str3 = family.lang;
            }
            if ((i10 & 8) != 0) {
                map = family.fonts;
            }
            return family.copy(str, str2, str3, map);
        }

        @Nullable
        public final String component1() {
            return this.name;
        }

        @Nullable
        public final String component2() {
            return this.variant;
        }

        @Nullable
        public final String component3() {
            return this.lang;
        }

        @NotNull
        public final Map<Weight, List<Font>> component4() {
            return this.fonts;
        }

        @NotNull
        public final Family copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull Map<Weight, ? extends List<Font>> fonts) {
            Intrinsics.checkNotNullParameter(fonts, "fonts");
            return new Family(str, str2, str3, fonts);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Family)) {
                return false;
            }
            Family family = (Family) obj;
            return Intrinsics.areEqual(this.name, family.name) && Intrinsics.areEqual(this.variant, family.variant) && Intrinsics.areEqual(this.lang, family.lang) && Intrinsics.areEqual(this.fonts, family.fonts);
        }

        @NotNull
        public final Map<Weight, List<Font>> getFonts() {
            return this.fonts;
        }

        @Nullable
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getVariant() {
            return this.variant;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.variant;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.lang;
            return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.fonts.hashCode();
        }

        @NotNull
        public String toString() {
            return "Family(name=" + this.name + ", variant=" + this.variant + ", lang=" + this.lang + ", fonts=" + this.fonts + ')';
        }

        public /* synthetic */ Family(String str, String str2, String str3, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, map);
        }
    }

    public static final class Font {

        @NotNull
        public static final Companion Companion = new Companion(null);

        @NotNull
        public static final String STYLE_ITALIC = "italic";

        @NotNull
        public static final String STYLE_NORMAL = "normal";

        @Nullable
        private final List<Axis> axis;

        @NotNull
        private final String name;

        @NotNull
        private final String style;

        @NotNull
        private final Weight weight;

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public Font(@NotNull Weight weight, @NotNull String style, @NotNull String name, @Nullable List<Axis> list) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(name, "name");
            this.weight = weight;
            this.style = style;
            this.name = name;
            this.axis = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Font copy$default(Font font, Weight weight, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weight = font.weight;
            }
            if ((i10 & 2) != 0) {
                str = font.style;
            }
            if ((i10 & 4) != 0) {
                str2 = font.name;
            }
            if ((i10 & 8) != 0) {
                list = font.axis;
            }
            return font.copy(weight, str, str2, list);
        }

        @NotNull
        public final Weight component1() {
            return this.weight;
        }

        @NotNull
        public final String component2() {
            return this.style;
        }

        @NotNull
        public final String component3() {
            return this.name;
        }

        @Nullable
        public final List<Axis> component4() {
            return this.axis;
        }

        @NotNull
        public final Font copy(@NotNull Weight weight, @NotNull String style, @NotNull String name, @Nullable List<Axis> list) {
            Intrinsics.checkNotNullParameter(weight, "weight");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Font(weight, style, name, list);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Font)) {
                return false;
            }
            Font font = (Font) obj;
            return Intrinsics.areEqual(this.weight, font.weight) && Intrinsics.areEqual(this.style, font.style) && Intrinsics.areEqual(this.name, font.name) && Intrinsics.areEqual(this.axis, font.axis);
        }

        @Nullable
        public final List<Axis> getAxis() {
            return this.axis;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getStyle() {
            return this.style;
        }

        @NotNull
        public final Weight getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int iHashCode = ((((this.weight.hashCode() * 31) + this.style.hashCode()) * 31) + this.name.hashCode()) * 31;
            List<Axis> list = this.axis;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @NotNull
        public String toString() {
            return "Font(weight=" + this.weight + ", style=" + this.style + ", name=" + this.name + ", axis=" + this.axis + ')';
        }

        public /* synthetic */ Font(Weight weight, String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(weight, str, str2, (i10 & 8) != 0 ? null : list);
        }
    }
}
