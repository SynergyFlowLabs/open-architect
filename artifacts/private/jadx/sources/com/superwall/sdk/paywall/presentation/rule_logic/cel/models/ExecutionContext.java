package com.superwall.sdk.paywall.presentation.rule_logic.cel.models;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlin.reflect.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.internal.z1;
import kotlinx.serialization.v;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
public final class ExecutionContext {

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, List<PassableValue>> computed;

    @NotNull
    private final Map<String, List<PassableValue>> device;

    @NotNull
    private final String expression;

    @NotNull
    private final PassableMap variables;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<ExecutionContext> serializer() {
            return ExecutionContext$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b3 b3Var = b3.f315897a;
        d dVarD = j1.d(PassableValue.class);
        d[] dVarArr = {j1.d(PassableValue.BoolValue.class), j1.d(PassableValue.BytesValue.class), j1.d(PassableValue.FloatValue.class), j1.d(PassableValue.FunctionValue.class), j1.d(PassableValue.IntValue.class), j1.d(PassableValue.ListValue.class), j1.d(PassableValue.MapValue.class), j1.d(PassableValue.NullValue.class), j1.d(PassableValue.StringValue.class), j1.d(PassableValue.TimestampValue.class), j1.d(PassableValue.UIntValue.class)};
        PassableValue$BoolValue$$serializer passableValue$BoolValue$$serializer = PassableValue$BoolValue$$serializer.INSTANCE;
        PassableValue$BytesValue$$serializer passableValue$BytesValue$$serializer = PassableValue$BytesValue$$serializer.INSTANCE;
        PassableValue$FloatValue$$serializer passableValue$FloatValue$$serializer = PassableValue$FloatValue$$serializer.INSTANCE;
        PassableValue$FunctionValue$$serializer passableValue$FunctionValue$$serializer = PassableValue$FunctionValue$$serializer.INSTANCE;
        PassableValue$IntValue$$serializer passableValue$IntValue$$serializer = PassableValue$IntValue$$serializer.INSTANCE;
        PassableValue$ListValue$$serializer passableValue$ListValue$$serializer = PassableValue$ListValue$$serializer.INSTANCE;
        PassableValue$MapValue$$serializer passableValue$MapValue$$serializer = PassableValue$MapValue$$serializer.INSTANCE;
        PassableValue.NullValue nullValue = PassableValue.NullValue.INSTANCE;
        z1 z1Var = new z1("Null", nullValue, new Annotation[0]);
        PassableValue$StringValue$$serializer passableValue$StringValue$$serializer = PassableValue$StringValue$$serializer.INSTANCE;
        PassableValue$TimestampValue$$serializer passableValue$TimestampValue$$serializer = PassableValue$TimestampValue$$serializer.INSTANCE;
        PassableValue$UIntValue$$serializer passableValue$UIntValue$$serializer = PassableValue$UIntValue$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, new e1(b3Var, new kotlinx.serialization.internal.f(new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", dVarD, dVarArr, new KSerializer[]{passableValue$BoolValue$$serializer, passableValue$BytesValue$$serializer, passableValue$FloatValue$$serializer, passableValue$FunctionValue$$serializer, passableValue$IntValue$$serializer, passableValue$ListValue$$serializer, passableValue$MapValue$$serializer, z1Var, passableValue$StringValue$$serializer, passableValue$TimestampValue$$serializer, passableValue$UIntValue$$serializer}, new Annotation[0]))), new e1(b3Var, new kotlinx.serialization.internal.f(new v("com.superwall.sdk.paywall.presentation.rule_logic.cel.models.PassableValue", j1.d(PassableValue.class), new d[]{j1.d(PassableValue.BoolValue.class), j1.d(PassableValue.BytesValue.class), j1.d(PassableValue.FloatValue.class), j1.d(PassableValue.FunctionValue.class), j1.d(PassableValue.IntValue.class), j1.d(PassableValue.ListValue.class), j1.d(PassableValue.MapValue.class), j1.d(PassableValue.NullValue.class), j1.d(PassableValue.StringValue.class), j1.d(PassableValue.TimestampValue.class), j1.d(PassableValue.UIntValue.class)}, new KSerializer[]{passableValue$BoolValue$$serializer, passableValue$BytesValue$$serializer, passableValue$FloatValue$$serializer, passableValue$FunctionValue$$serializer, passableValue$IntValue$$serializer, passableValue$ListValue$$serializer, passableValue$MapValue$$serializer, new z1("Null", nullValue, new Annotation[0]), passableValue$StringValue$$serializer, passableValue$TimestampValue$$serializer, passableValue$UIntValue$$serializer}, new Annotation[0])))};
    }

    public /* synthetic */ ExecutionContext(int i10, PassableMap passableMap, String str, Map map, Map map2, v2 v2Var) {
        if (15 != (i10 & 15)) {
            g2.b(i10, 15, ExecutionContext$$serializer.INSTANCE.getDescriptor());
        }
        this.variables = passableMap;
        this.expression = str;
        this.computed = map;
        this.device = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExecutionContext copy$default(ExecutionContext executionContext, PassableMap passableMap, String str, Map map, Map map2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            passableMap = executionContext.variables;
        }
        if ((i10 & 2) != 0) {
            str = executionContext.expression;
        }
        if ((i10 & 4) != 0) {
            map = executionContext.computed;
        }
        if ((i10 & 8) != 0) {
            map2 = executionContext.device;
        }
        return executionContext.copy(passableMap, str, map, map2);
    }

    @a0("computed")
    public static /* synthetic */ void getComputed$annotations() {
    }

    @a0("device")
    public static /* synthetic */ void getDevice$annotations() {
    }

    @a0("expression")
    public static /* synthetic */ void getExpression$annotations() {
    }

    @a0("variables")
    public static /* synthetic */ void getVariables$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(ExecutionContext executionContext, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, PassableMap$$serializer.INSTANCE, executionContext.variables);
        int i10 = 3 & 1;
        eVar.encodeStringElement(serialDescriptor, 1, executionContext.expression);
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], executionContext.computed);
        eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], executionContext.device);
    }

    @NotNull
    public final PassableMap component1() {
        return this.variables;
    }

    @NotNull
    public final String component2() {
        return this.expression;
    }

    @NotNull
    public final Map<String, List<PassableValue>> component3() {
        return this.computed;
    }

    @NotNull
    public final Map<String, List<PassableValue>> component4() {
        return this.device;
    }

    @NotNull
    public final ExecutionContext copy(@NotNull PassableMap variables, @NotNull String expression, @NotNull Map<String, ? extends List<? extends PassableValue>> computed, @NotNull Map<String, ? extends List<? extends PassableValue>> device) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(computed, "computed");
        Intrinsics.checkNotNullParameter(device, "device");
        return new ExecutionContext(variables, expression, computed, device);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExecutionContext)) {
            return false;
        }
        ExecutionContext executionContext = (ExecutionContext) obj;
        return Intrinsics.areEqual(this.variables, executionContext.variables) && Intrinsics.areEqual(this.expression, executionContext.expression) && Intrinsics.areEqual(this.computed, executionContext.computed) && Intrinsics.areEqual(this.device, executionContext.device);
    }

    @NotNull
    public final Map<String, List<PassableValue>> getComputed() {
        return this.computed;
    }

    @NotNull
    public final Map<String, List<PassableValue>> getDevice() {
        return this.device;
    }

    @NotNull
    public final String getExpression() {
        return this.expression;
    }

    @NotNull
    public final PassableMap getVariables() {
        return this.variables;
    }

    public int hashCode() {
        return (((((this.variables.hashCode() * 31) + this.expression.hashCode()) * 31) + this.computed.hashCode()) * 31) + this.device.hashCode();
    }

    @NotNull
    public String toString() {
        return "ExecutionContext(variables=" + this.variables + ", expression=" + this.expression + ", computed=" + this.computed + ", device=" + this.device + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExecutionContext(@NotNull PassableMap variables, @NotNull String expression, @NotNull Map<String, ? extends List<? extends PassableValue>> computed, @NotNull Map<String, ? extends List<? extends PassableValue>> device) {
        Intrinsics.checkNotNullParameter(variables, "variables");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(computed, "computed");
        Intrinsics.checkNotNullParameter(device, "device");
        this.variables = variables;
        this.expression = expression;
        this.computed = computed;
        this.device = device;
    }
}
