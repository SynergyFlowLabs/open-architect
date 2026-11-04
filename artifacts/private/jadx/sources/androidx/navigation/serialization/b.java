package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.d3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f71236a = new b();

    @SourceDebugExtension({"SMAP\nNavTypeConverter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumListType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n1#2:177\n1557#3:178\n1628#3,3:179\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumListType\n*L\n161#1:178\n161#1:179,3\n*E\n"})
    public static final class a<D extends Enum<?>> extends androidx.navigation.q<List<? extends D>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final d3.c<D> f71237a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            this.f71237a = new d3.c<>(type);
        }

        @Override // androidx.navigation.q
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<D> a() {
            return CollectionsKt.emptyList();
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public List<D> get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof List) {
                return (List) obj;
            }
            return null;
        }

        @Override // androidx.navigation.d3
        @NotNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public List<D> parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return CollectionsKt.listOf(this.f71237a.b(value));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Intrinsics.areEqual(this.f71237a, ((a) obj).f71237a);
            }
            return false;
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public List<D> parseValue(@NotNull String value, @Nullable List<? extends D> list) {
            List<D> listPlus;
            Intrinsics.checkNotNullParameter(value, "value");
            return (list == null || (listPlus = CollectionsKt.plus((Collection) list, (Iterable) parseValue(value))) == null) ? parseValue(value) : listPlus;
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable List<? extends D> list) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putSerializable(key, list != null ? new ArrayList(list) : null);
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            return "List<" + this.f71237a.getName() + "}>";
        }

        @Override // androidx.navigation.q
        @NotNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public List<String> b(@Nullable List<? extends D> list) {
            if (list == null) {
                return CollectionsKt.emptyList();
            }
            List<? extends D> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((Enum) it.next()).toString());
            }
            return arrayList;
        }

        public int hashCode() {
            return this.f71237a.hashCode();
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean valueEquals(@Nullable List<? extends D> list, @Nullable List<? extends D> list2) {
            return Intrinsics.areEqual(list != null ? new ArrayList(list) : null, list2 != null ? new ArrayList(list2) : null);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.serialization.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nNavTypeConverter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,176:1\n1#2:177\n1310#3,2:178\n*S KotlinDebug\n*F\n+ 1 NavTypeConverter.android.kt\nandroidx/navigation/serialization/InternalAndroidNavType$EnumNullableType\n*L\n86#1:178,2\n*E\n"})
    public static final class C0630b<D extends Enum<?>> extends c<D> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Class<D> f71238b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0630b(@NotNull Class<D> type) {
            super(type);
            Intrinsics.checkNotNullParameter(type, "type");
            if (type.isEnum()) {
                this.f71238b = type;
                return;
            }
            throw new IllegalArgumentException((type + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.b.c, androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public D parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            D d10 = null;
            if (Intrinsics.areEqual(value, AbstractJsonLexerKt.NULL)) {
                return null;
            }
            D[] enumConstants = this.f71238b.getEnumConstants();
            Intrinsics.checkNotNull(enumConstants);
            for (D d11 : enumConstants) {
                D d12 = d11;
                Intrinsics.checkNotNull(d12);
                if (StringsKt.N1(d12.name(), value, true)) {
                    d10 = d11;
                    break;
                }
            }
            D d13 = d10;
            if (d13 != null) {
                return d13;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.f71238b.getName() + '.');
        }

        @Override // androidx.navigation.serialization.b.c, androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f71238b.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
    }

    public static class c<D extends Serializable> extends d3<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Class<D> f71239a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            this.f71239a = type;
            if (Serializable.class.isAssignableFrom(type)) {
                return;
            }
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D get(@NotNull Bundle bundle, @NotNull String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = bundle.get(key);
            if (obj instanceof Serializable) {
                return (D) obj;
            }
            return null;
        }

        @Override // androidx.navigation.d3
        @Nullable
        /* JADX INFO: renamed from: b */
        public D parseValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.d3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void put(@NotNull Bundle bundle, @NotNull String key, @Nullable D d10) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            bundle.putSerializable(key, this.f71239a.cast(d10));
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return Intrinsics.areEqual(this.f71239a, ((c) obj).f71239a);
            }
            return false;
        }

        @Override // androidx.navigation.d3
        @NotNull
        public String getName() {
            String name = this.f71239a.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }

        public int hashCode() {
            return this.f71239a.hashCode();
        }
    }

    private b() {
    }
}
