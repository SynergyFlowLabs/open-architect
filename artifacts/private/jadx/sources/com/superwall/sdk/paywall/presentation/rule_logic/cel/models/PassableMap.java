package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.lang.annotation.Annotation;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.v;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@a0("PassableMap")
public final class PassableMap {

    @NotNull
    private final Map<String, PassableValue> map;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new e1(b3.f315897a, new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", j1.d(PassableValue.class), new d[]{j1.d(PassableValue.BoolValue.class), j1.d(PassableValue.BytesValue.class), j1.d(PassableValue.FloatValue.class), j1.d(PassableValue.FunctionValue.class), j1.d(PassableValue.IntValue.class), j1.d(PassableValue.ListValue.class), j1.d(PassableValue.MapValue.class), j1.d(PassableValue.NullValue.class), j1.d(PassableValue.StringValue.class), j1.d(PassableValue.TimestampValue.class), j1.d(PassableValue.UIntValue.class)}, new KSerializer[]{PassableValue$BoolValue$$serializer.INSTANCE, PassableValue$BytesValue$$serializer.INSTANCE, PassableValue$FloatValue$$serializer.INSTANCE, PassableValue$FunctionValue$$serializer.INSTANCE, PassableValue$IntValue$$serializer.INSTANCE, PassableValue$ListValue$$serializer.INSTANCE, PassableValue$MapValue$$serializer.INSTANCE, new z1("Null", PassableValue.NullValue.INSTANCE, new Annotation[0]), PassableValue$StringValue$$serializer.INSTANCE, PassableValue$TimestampValue$$serializer.INSTANCE, PassableValue$UIntValue$$serializer.INSTANCE}, new Annotation[0]))};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<PassableMap> serializer() {
            return PassableMap$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PassableMap(int i10, Map map, v2 v2Var) {
        if (1 != (i10 & 1)) {
            g2.b(i10, 1, PassableMap$$serializer.INSTANCE.getDescriptor());
        }
        this.map = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PassableMap copy$default(PassableMap passableMap, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = passableMap.map;
        }
        return passableMap.copy(map);
    }

    @a0("map")
    public static /* synthetic */ void getMap$annotations() {
    }

    @NotNull
    public final Map<String, PassableValue> component1() {
        return this.map;
    }

    @NotNull
    public final PassableMap copy(@NotNull Map<String, ? extends PassableValue> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return new PassableMap(map);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassableMap) && Intrinsics.areEqual(this.map, ((PassableMap) obj).map);
    }

    @NotNull
    public final Map<String, PassableValue> getMap() {
        return this.map;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @NotNull
    public String toString() {
        return "PassableMap(map=" + this.map + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassableMap(@NotNull Map<String, ? extends PassableValue> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }
}
