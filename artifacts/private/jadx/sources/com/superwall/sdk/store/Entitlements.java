package com.superwall.sdk.store;

import com.superwall.sdk.billing.DecomposedProductIds;
import com.superwall.sdk.models.entitlements.Entitlement;
import com.superwall.sdk.models.entitlements.SubscriptionStatus;
import com.superwall.sdk.models.internal.WebRedemptionResponse;
import com.superwall.sdk.storage.LatestRedemptionResponse;
import com.superwall.sdk.storage.Storage;
import com.superwall.sdk.storage.StoredEntitlementsByProductId;
import com.superwall.sdk.storage.StoredSubscriptionStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.a0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.b1;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k0;
import kotlinx.coroutines.flow.z0;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nEntitlements.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Entitlements.kt\ncom/superwall/sdk/store/Entitlements\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,168:1\n1863#2:169\n295#2,2:170\n1864#2:172\n1246#2,4:175\n462#3:173\n412#3:174\n*S KotlinDebug\n*F\n+ 1 Entitlements.kt\ncom/superwall/sdk/store/Entitlements\n*L\n141#1:169\n143#1:170,2\n141#1:172\n159#1:175,4\n159#1:173\n159#1:174\n*E\n"})
public final class Entitlements {

    @NotNull
    private final Set<Entitlement> _activeDeviceEntitlements;

    @NotNull
    private final Set<Entitlement> _all;

    @NotNull
    private final ConcurrentHashMap<String, Set<Entitlement>> _entitlementsByProduct;

    @NotNull
    private final Set<Entitlement> _inactive;

    @NotNull
    private final k0<SubscriptionStatus> _status;

    @NotNull
    private Set<Entitlement> backingActive;

    @NotNull
    private final s0 scope;

    @NotNull
    private final Storage storage;

    /* JADX INFO: renamed from: com.superwall.sdk.store.Entitlements$3, reason: invalid class name */
    @f(c = "com.superwall.sdk.store.Entitlements$3", f = "Entitlements.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160711n0}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {
        int label;

        AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return Entitlements.this.new AnonymousClass3(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                z0<SubscriptionStatus> status = Entitlements.this.getStatus();
                final Entitlements entitlements = Entitlements.this;
                j<? super SubscriptionStatus> jVar = new j() { // from class: com.superwall.sdk.store.Entitlements.3.1
                    @Override // kotlinx.coroutines.flow.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.d dVar) {
                        return emit((SubscriptionStatus) obj2, (kotlin.coroutines.d<? super Unit>) dVar);
                    }

                    public final Object emit(SubscriptionStatus subscriptionStatus, kotlin.coroutines.d<? super Unit> dVar) {
                        entitlements.storage.write(StoredSubscriptionStatus.INSTANCE, subscriptionStatus);
                        return Unit.f312394a;
                    }
                };
                this.label = 1;
                if (status.collect(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            throw new a0();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((AnonymousClass3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public Entitlements(@NotNull Storage storage, @NotNull s0 scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.storage = storage;
        this.scope = scope;
        ConcurrentHashMap<String, Set<Entitlement>> concurrentHashMap = new ConcurrentHashMap<>();
        this._entitlementsByProduct = concurrentHashMap;
        this._status = b1.a(SubscriptionStatus.Unknown.INSTANCE);
        this.backingActive = new LinkedHashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this._all = linkedHashSet;
        this._activeDeviceEntitlements = new LinkedHashSet();
        this._inactive = CollectionsKt.toMutableSet(CollectionsKt.subtract(linkedHashSet, this.backingActive));
        SubscriptionStatus subscriptionStatus = (SubscriptionStatus) storage.read(StoredSubscriptionStatus.INSTANCE);
        if (subscriptionStatus != null) {
            setSubscriptionStatus(subscriptionStatus);
        }
        Map<? extends String, ? extends Set<Entitlement>> map = (Map) storage.read(StoredEntitlementsByProductId.INSTANCE);
        if (map != null) {
            concurrentHashMap.putAll(map);
        }
        k.f(scope, null, null, new AnonymousClass3(null), 3, null);
    }

    public final void addEntitlementsByProductId$superwall_release(@NotNull Map<String, ? extends Set<Entitlement>> idToEntitlements) {
        Intrinsics.checkNotNullParameter(idToEntitlements, "idToEntitlements");
        ConcurrentHashMap<String, Set<Entitlement>> concurrentHashMap = this._entitlementsByProduct;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(idToEntitlements.size()));
        Iterator<T> it = idToEntitlements.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), CollectionsKt.toSet((Set) entry.getValue()));
        }
        concurrentHashMap.putAll(MapsKt.toMap(linkedHashMap));
        this._all.clear();
        Set<Entitlement> set = this._all;
        Collection<Set<Entitlement>> collectionValues = this._entitlementsByProduct.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        set.addAll(CollectionsKt.flatten(collectionValues));
        this.storage.write(StoredEntitlementsByProductId.INSTANCE, this._entitlementsByProduct);
    }

    @NotNull
    public final Set<Entitlement> byProductId$superwall_release(@NotNull String id2) {
        Object obj;
        Intrinsics.checkNotNullParameter(id2, "id");
        DecomposedProductIds decomposedProductIdsFrom = DecomposedProductIds.Companion.from(id2);
        for (String str : CollectionsKt.listOf((Object[]) new String[]{decomposedProductIdsFrom.getFullId(), decomposedProductIdsFrom.getSubscriptionId() + ":" + decomposedProductIdsFrom.getBasePlanId(), decomposedProductIdsFrom.getSubscriptionId()})) {
            Set<Map.Entry<String, Set<Entitlement>>> setEntrySet = this._entitlementsByProduct.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Iterator<T> it = setEntrySet.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Map.Entry entry = (Map.Entry) next;
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                if (StringsKt.V2((CharSequence) key, str, false, 2, null)) {
                    Object value = entry.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                    if (!((Collection) value).isEmpty()) {
                        obj = next;
                        break;
                    }
                }
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                Object value2 = entry2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "<get-value>(...)");
                return (Set) value2;
            }
        }
        return SetsKt.emptySet();
    }

    @NotNull
    public final Set<Entitlement> getActive() {
        return SetsKt.plus(SetsKt.plus((Set) this.backingActive, (Iterable) this._activeDeviceEntitlements), (Iterable) getWeb());
    }

    @NotNull
    public final Set<Entitlement> getActiveDeviceEntitlements$superwall_release() {
        return this._activeDeviceEntitlements;
    }

    @NotNull
    public final Set<Entitlement> getAll() {
        Set set = CollectionsKt.toSet(this._all);
        Collection<Set<Entitlement>> collectionValues = this._entitlementsByProduct.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return SetsKt.plus(SetsKt.plus(set, (Iterable) CollectionsKt.flatten(collectionValues)), (Iterable) CollectionsKt.toSet(getWeb()));
    }

    @NotNull
    public final Set<Entitlement> getInactive() {
        return SetsKt.plus(CollectionsKt.toSet(this._inactive), (Iterable) SetsKt.minus((Set) getAll(), (Iterable) getActive()));
    }

    @NotNull
    public final z0<SubscriptionStatus> getStatus() {
        return kotlinx.coroutines.flow.k.n(this._status);
    }

    @NotNull
    public final Set<Entitlement> getWeb() {
        List<Entitlement> entitlements;
        Set<Entitlement> set;
        WebRedemptionResponse webRedemptionResponse = (WebRedemptionResponse) this.storage.read(LatestRedemptionResponse.INSTANCE);
        return (webRedemptionResponse == null || (entitlements = webRedemptionResponse.getEntitlements()) == null || (set = CollectionsKt.toSet(entitlements)) == null) ? SetsKt.emptySet() : set;
    }

    public final void setActiveDeviceEntitlements$superwall_release(@NotNull Set<Entitlement> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._activeDeviceEntitlements.clear();
        this._activeDeviceEntitlements.addAll(value);
    }

    public final void setSubscriptionStatus(@NotNull SubscriptionStatus value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value instanceof SubscriptionStatus.Active) {
            SubscriptionStatus.Active active = (SubscriptionStatus.Active) value;
            if (active.getEntitlements().isEmpty()) {
                setSubscriptionStatus(SubscriptionStatus.Inactive.INSTANCE);
                return;
            }
            this.backingActive.addAll(active.getEntitlements());
            this._all.addAll(active.getEntitlements());
            this._inactive.removeAll(active.getEntitlements());
            this._status.setValue(value);
            return;
        }
        if (value instanceof SubscriptionStatus.Inactive) {
            this._activeDeviceEntitlements.clear();
            this.backingActive.clear();
            this._inactive.clear();
            this._status.setValue(value);
            return;
        }
        if (!(value instanceof SubscriptionStatus.Unknown)) {
            throw new kotlin.k0();
        }
        this.backingActive.clear();
        this._activeDeviceEntitlements.clear();
        this._inactive.clear();
        this._status.setValue(value);
    }

    public /* synthetic */ Entitlements(Storage storage, s0 s0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storage, (i10 & 2) != 0 ? t0.a(l1.a()) : s0Var);
    }
}
