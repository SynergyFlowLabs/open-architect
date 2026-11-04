package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.r;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
public final class ViewModel extends NativeObject {

    public static final class Property {

        @NotNull
        private final String name;

        @NotNull
        private final PropertyDataType type;

        public Property(@NotNull PropertyDataType type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            this.type = type;
            this.name = name;
        }

        public static /* synthetic */ Property copy$default(Property property, PropertyDataType propertyDataType, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                propertyDataType = property.type;
            }
            if ((i10 & 2) != 0) {
                str = property.name;
            }
            return property.copy(propertyDataType, str);
        }

        @NotNull
        public final PropertyDataType component1() {
            return this.type;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final Property copy(@NotNull PropertyDataType type, @NotNull String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            return new Property(type, name);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Property)) {
                return false;
            }
            Property property = (Property) obj;
            return this.type == property.type && Intrinsics.areEqual(this.name, property.name);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final PropertyDataType getType() {
            return this.type;
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.name.hashCode();
        }

        @NotNull
        public String toString() {
            return "Property(type=" + this.type + ", name=" + this.name + ')';
        }
    }

    @SourceDebugExtension({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel$PropertyDataType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,146:1\n1202#2,2:147\n1230#2,4:149\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\napp/rive/runtime/kotlin/core/ViewModel$PropertyDataType\n*L\n139#1:147,2\n139#1:149,4\n*E\n"})
    public enum PropertyDataType {
        NONE(0),
        STRING(1),
        NUMBER(2),
        BOOLEAN(3),
        COLOR(4),
        LIST(5),
        ENUM(6),
        TRIGGER(7),
        VIEW_MODEL(8);


        @NotNull
        private static final Map<Integer, PropertyDataType> map;
        private final int value;
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = kotlin.enums.c.c(values());

        @NotNull
        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @n
            @Nullable
            public final PropertyDataType fromInt(int i10) {
                return (PropertyDataType) PropertyDataType.map.get(Integer.valueOf(i10));
            }

            private Companion() {
            }
        }

        static {
            kotlin.enums.a<PropertyDataType> entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(r.u(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
            for (PropertyDataType propertyDataType : entries) {
                linkedHashMap.put(Integer.valueOf(propertyDataType.value), propertyDataType);
            }
            map = linkedHashMap;
        }

        PropertyDataType(int i10) {
            this.value = i10;
        }

        @n
        @Nullable
        public static final PropertyDataType fromInt(int i10) {
            return Companion.fromInt(i10);
        }

        @NotNull
        public static kotlin.enums.a<PropertyDataType> getEntries() {
            return $ENTRIES;
        }

        public final int getValue() {
            return this.value;
        }
    }

    public ViewModel(long j10) {
        super(j10);
    }

    private final native long cppCreateBlankInstance(long j10);

    private final native long cppCreateDefaultInstance(long j10);

    private final native long cppCreateInstanceFromIndex(long j10, int i10);

    private final native long cppCreateInstanceFromName(long j10, String str);

    private final native List<Property> cppGetProperties(long j10);

    private final native int cppInstanceCount(long j10);

    private final native String cppName(long j10);

    private final native int cppPropertyCount(long j10);

    @NotNull
    public final ViewModelInstance createBlankInstance() throws ViewModelException {
        long jCppCreateBlankInstance = cppCreateBlankInstance(getCppPointer());
        if (jCppCreateBlankInstance == 0) {
            throw new ViewModelException("Could not create a blank ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateBlankInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    @NotNull
    public final ViewModelInstance createDefaultInstance() throws ViewModelException {
        long jCppCreateDefaultInstance = cppCreateDefaultInstance(getCppPointer());
        if (jCppCreateDefaultInstance == 0) {
            throw new ViewModelException("Could not create default ViewModel instance");
        }
        ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateDefaultInstance);
        getDependencies().add(viewModelInstance);
        return viewModelInstance;
    }

    @NotNull
    public final ViewModelInstance createInstanceFromIndex(int i10) throws ViewModelException {
        long jCppCreateInstanceFromIndex = cppCreateInstanceFromIndex(getCppPointer(), i10);
        if (jCppCreateInstanceFromIndex != 0) {
            ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromIndex);
            getDependencies().add(viewModelInstance);
            return viewModelInstance;
        }
        throw new ViewModelException("ViewModel instance not found: " + i10);
    }

    @NotNull
    public final ViewModelInstance createInstanceFromName(@NotNull String name) throws ViewModelException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppCreateInstanceFromName = cppCreateInstanceFromName(getCppPointer(), name);
        if (jCppCreateInstanceFromName != 0) {
            ViewModelInstance viewModelInstance = new ViewModelInstance(jCppCreateInstanceFromName);
            getDependencies().add(viewModelInstance);
            return viewModelInstance;
        }
        throw new ViewModelException("ViewModel instance not found: " + name);
    }

    public final int getInstanceCount() {
        return cppInstanceCount(getCppPointer());
    }

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }

    @NotNull
    public final List<Property> getProperties() {
        return cppGetProperties(getCppPointer());
    }

    public final int getPropertyCount() {
        return cppPropertyCount(getCppPointer());
    }
}
