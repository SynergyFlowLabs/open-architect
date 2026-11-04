package com.superwall.sdk.paywall.view.webview.templating.models;

import com.superwall.sdk.models.product.ProductVariable;
import com.superwall.sdk.models.product.ProductVariableSerializer;
import com.superwall.sdk.models.serialization.AnySerializer;
import hk.a;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.b3;
import kotlinx.serialization.internal.e1;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nVariables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Variables.kt\ncom/superwall/sdk/paywall/view/webview/templating/models/Variables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1863#2,2:78\n*S KotlinDebug\n*F\n+ 1 Variables.kt\ncom/superwall/sdk/paywall/view/webview/templating/models/Variables\n*L\n52#1:78,2\n*E\n"})
public final class Variables {

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final Map<String, Object> device;

    @NotNull
    private final Map<String, Object> params;

    @NotNull
    private Map<String, ? extends Object> primary;

    @NotNull
    private List<ProductVariable> products;

    @NotNull
    private Map<String, ? extends Object> secondary;

    @NotNull
    private Map<String, ? extends Object> tertiary;

    @NotNull
    private final Map<String, Object> user;

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<Variables> serializer() {
            return Variables$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        b3 b3Var = b3.f315897a;
        AnySerializer anySerializer = AnySerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new e1(b3Var, a.v(anySerializer)), new e1(b3Var, a.v(anySerializer)), new e1(b3Var, a.v(anySerializer)), new kotlinx.serialization.internal.f(ProductVariableSerializer.INSTANCE), new e1(b3Var, a.v(anySerializer)), new e1(b3Var, a.v(anySerializer)), new e1(b3Var, a.v(anySerializer))};
    }

    public /* synthetic */ Variables(int i10, Map map, Map map2, Map map3, List list, Map map4, Map map5, Map map6, v2 v2Var) {
        if (7 != (i10 & 7)) {
            g2.b(i10, 7, Variables$$serializer.INSTANCE.getDescriptor());
        }
        this.user = map;
        this.device = map2;
        this.params = map3;
        if ((i10 & 8) == 0) {
            this.products = CollectionsKt.emptyList();
        } else {
            this.products = list;
        }
        if ((i10 & 16) == 0) {
            this.primary = MapsKt.emptyMap();
        } else {
            this.primary = map4;
        }
        if ((i10 & 32) == 0) {
            this.secondary = MapsKt.emptyMap();
        } else {
            this.secondary = map5;
        }
        if ((i10 & 64) == 0) {
            this.tertiary = MapsKt.emptyMap();
        } else {
            this.tertiary = map6;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Variables copy$default(Variables variables, Map map, Map map2, Map map3, List list, Map map4, Map map5, Map map6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = variables.user;
        }
        if ((i10 & 2) != 0) {
            map2 = variables.device;
        }
        if ((i10 & 4) != 0) {
            map3 = variables.params;
        }
        if ((i10 & 8) != 0) {
            list = variables.products;
        }
        if ((i10 & 16) != 0) {
            map4 = variables.primary;
        }
        if ((i10 & 32) != 0) {
            map5 = variables.secondary;
        }
        if ((i10 & 64) != 0) {
            map6 = variables.tertiary;
        }
        Map map7 = map5;
        Map map8 = map6;
        Map map9 = map4;
        Map map10 = map3;
        return variables.copy(map, map2, map10, list, map9, map7, map8);
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(Variables variables, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], variables.user);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], variables.device);
        eVar.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], variables.params);
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.areEqual(variables.products, CollectionsKt.emptyList())) {
            eVar.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], variables.products);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.areEqual(variables.primary, MapsKt.emptyMap())) {
            eVar.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], variables.primary);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.areEqual(variables.secondary, MapsKt.emptyMap())) {
            eVar.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], variables.secondary);
        }
        if (eVar.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.areEqual(variables.tertiary, MapsKt.emptyMap())) {
            eVar.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], variables.tertiary);
        }
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.user;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.device;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.params;
    }

    @NotNull
    public final List<ProductVariable> component4() {
        return this.products;
    }

    @NotNull
    public final Map<String, Object> component5() {
        return this.primary;
    }

    @NotNull
    public final Map<String, Object> component6() {
        return this.secondary;
    }

    @NotNull
    public final Map<String, Object> component7() {
        return this.tertiary;
    }

    @NotNull
    public final Variables copy(@NotNull Map<String, ? extends Object> user, @NotNull Map<String, ? extends Object> device, @NotNull Map<String, ? extends Object> params, @NotNull List<ProductVariable> products, @NotNull Map<String, ? extends Object> primary, @NotNull Map<String, ? extends Object> secondary, @NotNull Map<String, ? extends Object> tertiary) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(tertiary, "tertiary");
        return new Variables(user, device, params, products, primary, secondary, tertiary);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Variables)) {
            return false;
        }
        Variables variables = (Variables) obj;
        return Intrinsics.areEqual(this.user, variables.user) && Intrinsics.areEqual(this.device, variables.device) && Intrinsics.areEqual(this.params, variables.params) && Intrinsics.areEqual(this.products, variables.products) && Intrinsics.areEqual(this.primary, variables.primary) && Intrinsics.areEqual(this.secondary, variables.secondary) && Intrinsics.areEqual(this.tertiary, variables.tertiary);
    }

    @NotNull
    public final Map<String, Object> getDevice() {
        return this.device;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @NotNull
    public final Map<String, Object> getPrimary() {
        return this.primary;
    }

    @NotNull
    public final List<ProductVariable> getProducts() {
        return this.products;
    }

    @NotNull
    public final Map<String, Object> getSecondary() {
        return this.secondary;
    }

    @NotNull
    public final Map<String, Object> getTertiary() {
        return this.tertiary;
    }

    @NotNull
    public final Map<String, Object> getUser() {
        return this.user;
    }

    public int hashCode() {
        return (((((((((((this.user.hashCode() * 31) + this.device.hashCode()) * 31) + this.params.hashCode()) * 31) + this.products.hashCode()) * 31) + this.primary.hashCode()) * 31) + this.secondary.hashCode()) * 31) + this.tertiary.hashCode();
    }

    public final void setPrimary(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.primary = map;
    }

    public final void setProducts(@NotNull List<ProductVariable> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.products = list;
    }

    public final void setSecondary(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.secondary = map;
    }

    public final void setTertiary(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.tertiary = map;
    }

    @NotNull
    public final JsonVariables templated() {
        return new JsonVariables("template_variables", this);
    }

    @NotNull
    public String toString() {
        return "Variables(user=" + this.user + ", device=" + this.device + ", params=" + this.params + ", products=" + this.products + ", primary=" + this.primary + ", secondary=" + this.secondary + ", tertiary=" + this.tertiary + ")";
    }

    public Variables(@NotNull Map<String, ? extends Object> user, @NotNull Map<String, ? extends Object> device, @NotNull Map<String, ? extends Object> params, @NotNull List<ProductVariable> products, @NotNull Map<String, ? extends Object> primary, @NotNull Map<String, ? extends Object> secondary, @NotNull Map<String, ? extends Object> tertiary) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(primary, "primary");
        Intrinsics.checkNotNullParameter(secondary, "secondary");
        Intrinsics.checkNotNullParameter(tertiary, "tertiary");
        this.user = user;
        this.device = device;
        this.params = params;
        this.products = products;
        this.primary = primary;
        this.secondary = secondary;
        this.tertiary = tertiary;
    }

    public /* synthetic */ Variables(Map map, Map map2, Map map3, List list, Map map4, Map map5, Map map6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, map2, map3, (i10 & 8) != 0 ? CollectionsKt.emptyList() : list, (i10 & 16) != 0 ? MapsKt.emptyMap() : map4, (i10 & 32) != 0 ? MapsKt.emptyMap() : map5, (i10 & 64) != 0 ? MapsKt.emptyMap() : map6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Variables(@Nullable List<ProductVariable> list, @Nullable Map<String, ? extends Object> map, @NotNull Map<String, ? extends Object> userAttributes, @Nullable Map<String, ? extends Object> map2) {
        this(userAttributes, map2 == null ? MapsKt.emptyMap() : map2, map == null ? MapsKt.emptyMap() : map, (List) null, (Map) null, (Map) null, (Map) null, 120, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(userAttributes, "userAttributes");
        int i10 = 2 >> 0;
        if (list != null) {
            for (ProductVariable productVariable : list) {
                String name = productVariable.getName();
                int iHashCode = name.hashCode();
                if (iHashCode != -1174796206) {
                    if (iHashCode != -817598092) {
                        if (iHashCode == -314765822 && name.equals("primary")) {
                            this.primary = productVariable.getAttributes();
                        }
                    } else if (name.equals("secondary")) {
                        this.secondary = productVariable.getAttributes();
                    }
                } else if (name.equals("tertiary")) {
                    this.tertiary = productVariable.getAttributes();
                }
            }
        }
        if (list != null) {
            this.products = list;
        }
    }
}
