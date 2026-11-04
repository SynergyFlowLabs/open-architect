package com.superwall.sdk.models.internal;

import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.Entitlement$$serializer;
import com.superwall.sdk.models.entitlements.Redeemable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.a0;
import kotlinx.serialization.b0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.g2;
import kotlinx.serialization.internal.v2;
import kotlinx.serialization.s0;
import oj.f;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@b0
@SourceDebugExtension({"SMAP\nWebRedemption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebRedemption.kt\ncom/superwall/sdk/models/internal/WebRedemptionResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,287:1\n1557#2:288\n1628#2,3:289\n*S KotlinDebug\n*F\n+ 1 WebRedemption.kt\ncom/superwall/sdk/models/internal/WebRedemptionResponse\n*L\n36#1:288\n36#1:289,3\n*E\n"})
public final class WebRedemptionResponse {

    @NotNull
    private final List<Redeemable> allCodes;

    @NotNull
    private final List<RedemptionResult> codes;

    @NotNull
    private final List<Entitlement> entitlements;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @f
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {new kotlinx.serialization.internal.f(RedemptionResult.Companion.serializer()), new kotlinx.serialization.internal.f(Entitlement$$serializer.INSTANCE)};

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer<WebRedemptionResponse> serializer() {
            return WebRedemptionResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = 1 << 2;
    }

    public /* synthetic */ WebRedemptionResponse(int i10, List list, List list2, v2 v2Var) {
        if (3 != (i10 & 3)) {
            g2.b(i10, 3, WebRedemptionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.codes = list;
        this.entitlements = list2;
        List list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new Redeemable(((RedemptionResult) it.next()).getCode(), Boolean.FALSE));
        }
        this.allCodes = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebRedemptionResponse copy$default(WebRedemptionResponse webRedemptionResponse, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = webRedemptionResponse.codes;
        }
        if ((i10 & 2) != 0) {
            list2 = webRedemptionResponse.entitlements;
        }
        if ((i10 & 4) != 0) {
            list3 = webRedemptionResponse.allCodes;
        }
        return webRedemptionResponse.copy(list, list2, list3);
    }

    @s0
    public static /* synthetic */ void getAllCodes$annotations() {
    }

    @a0("codes")
    public static /* synthetic */ void getCodes$annotations() {
    }

    @a0("entitlements")
    public static /* synthetic */ void getEntitlements$annotations() {
    }

    @n
    public static final /* synthetic */ void write$Self$superwall_release(WebRedemptionResponse webRedemptionResponse, e eVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        eVar.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], webRedemptionResponse.codes);
        eVar.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], webRedemptionResponse.entitlements);
    }

    @NotNull
    public final List<RedemptionResult> component1() {
        return this.codes;
    }

    @NotNull
    public final List<Entitlement> component2() {
        return this.entitlements;
    }

    @NotNull
    public final List<Redeemable> component3() {
        return this.allCodes;
    }

    @NotNull
    public final WebRedemptionResponse copy(@NotNull List<? extends RedemptionResult> codes, @NotNull List<Entitlement> entitlements, @NotNull List<Redeemable> allCodes) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        Intrinsics.checkNotNullParameter(allCodes, "allCodes");
        return new WebRedemptionResponse(codes, entitlements, allCodes);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebRedemptionResponse)) {
            return false;
        }
        WebRedemptionResponse webRedemptionResponse = (WebRedemptionResponse) obj;
        if (Intrinsics.areEqual(this.codes, webRedemptionResponse.codes) && Intrinsics.areEqual(this.entitlements, webRedemptionResponse.entitlements) && Intrinsics.areEqual(this.allCodes, webRedemptionResponse.allCodes)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final List<Redeemable> getAllCodes() {
        return this.allCodes;
    }

    @NotNull
    public final List<RedemptionResult> getCodes() {
        return this.codes;
    }

    @NotNull
    public final List<Entitlement> getEntitlements() {
        return this.entitlements;
    }

    public int hashCode() {
        return (((this.codes.hashCode() * 31) + this.entitlements.hashCode()) * 31) + this.allCodes.hashCode();
    }

    @NotNull
    public String toString() {
        return "WebRedemptionResponse(codes=" + this.codes + ", entitlements=" + this.entitlements + ", allCodes=" + this.allCodes + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebRedemptionResponse(@NotNull List<? extends RedemptionResult> codes, @NotNull List<Entitlement> entitlements, @NotNull List<Redeemable> allCodes) {
        Intrinsics.checkNotNullParameter(codes, "codes");
        Intrinsics.checkNotNullParameter(entitlements, "entitlements");
        Intrinsics.checkNotNullParameter(allCodes, "allCodes");
        this.codes = codes;
        this.entitlements = entitlements;
        this.allCodes = allCodes;
    }

    public /* synthetic */ WebRedemptionResponse(List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 4) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(new Redeemable(((RedemptionResult) it.next()).getCode(), Boolean.FALSE));
            }
            list3 = arrayList;
        }
        this(list, list2, list3);
    }
}
