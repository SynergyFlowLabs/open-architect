package com.segment.analytics.kotlin.core.platform.plugins;

import com.segment.analytics.kotlin.core.BaseEvent;
import com.segment.analytics.kotlin.core.DestinationMetadata;
import com.segment.analytics.kotlin.core.Settings;
import com.segment.analytics.kotlin.core.utilities.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nDestinationMetadataPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DestinationMetadataPlugin.kt\ncom/segment/analytics/kotlin/core/platform/plugins/DestinationMetadataPlugin\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1549#2:68\n1620#2,3:69\n766#2:72\n857#2,2:73\n1855#2,2:76\n1855#2,2:78\n1855#2,2:80\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DestinationMetadataPlugin.kt\ncom/segment/analytics/kotlin/core/platform/plugins/DestinationMetadataPlugin\n*L\n30#1:68\n30#1:69,3\n31#1:72\n31#1:73,2\n34#1:76,2\n39#1:78,2\n47#1:80,2\n*E\n"})
public final class b implements com.segment.analytics.kotlin.core.platform.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.segment.analytics.kotlin.core.a f266906b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.segment.analytics.kotlin.core.platform.e.b f266905a = com.segment.analytics.kotlin.core.platform.e.b.Enrichment;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Settings f266907c = new Settings((JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, (JsonObject) null, 63, (DefaultConstructorMarker) null);

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public BaseEvent a(@NotNull BaseEvent event) {
        ArrayList arrayList;
        JsonObject jsonObjectK;
        JsonElement jsonElement;
        JsonArray jsonArrayJ;
        CopyOnWriteArrayList<com.segment.analytics.kotlin.core.platform.e> copyOnWriteArrayListF;
        Intrinsics.checkNotNullParameter(event, "event");
        com.segment.analytics.kotlin.core.platform.d dVar = j().x().i().get(com.segment.analytics.kotlin.core.platform.e.b.Destination);
        if (dVar == null || (copyOnWriteArrayListF = dVar.f()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(copyOnWriteArrayListF, 10));
            for (com.segment.analytics.kotlin.core.platform.e eVar : copyOnWriteArrayListF) {
                Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type com.segment.analytics.kotlin.core.platform.DestinationPlugin");
                arrayList2.add((com.segment.analytics.kotlin.core.platform.a) eVar);
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                com.segment.analytics.kotlin.core.platform.a aVar = (com.segment.analytics.kotlin.core.platform.a) obj;
                if (aVar.n() && !(aVar instanceof e)) {
                    arrayList.add(obj);
                }
            }
        }
        DestinationMetadata destinationMetadata = new DestinationMetadata((List) null, (List) null, (List) null, 7, (DefaultConstructorMarker) null);
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                setCreateSetBuilder.add(((com.segment.analytics.kotlin.core.platform.a) it.next()).o());
            }
        }
        Set setBuild = SetsKt.build(setCreateSetBuilder);
        Set setCreateSetBuilder2 = SetsKt.createSetBuilder();
        for (String str : this.f266907c.m().keySet()) {
            if (!Intrinsics.areEqual(str, "Segment.io") && !setBuild.contains(str)) {
                setCreateSetBuilder2.add(str);
            }
        }
        JsonElement jsonElement2 = (JsonElement) this.f266907c.m().get((Object) "Segment.io");
        if (jsonElement2 != null && (jsonObjectK = o.k(jsonElement2)) != null && (jsonElement = (JsonElement) jsonObjectK.get((Object) "unbundledIntegrations")) != null && (jsonArrayJ = o.j(jsonElement)) != null) {
            for (JsonElement jsonElement3 : jsonArrayJ) {
                Intrinsics.checkNotNull(jsonElement3, "null cannot be cast to non-null type kotlinx.serialization.json.JsonPrimitive");
                String content = ((JsonPrimitive) jsonElement3).getContent();
                if (!setBuild.contains(content)) {
                    setCreateSetBuilder2.add(content);
                }
            }
        }
        Set setBuild2 = SetsKt.build(setCreateSetBuilder2);
        destinationMetadata.j(CollectionsKt.emptyList());
        destinationMetadata.i(CollectionsKt.toList(setBuild));
        destinationMetadata.k(CollectionsKt.toList(setBuild2));
        BaseEvent baseEventC = event.c();
        baseEventC.u(destinationMetadata);
        return baseEventC;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void b(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        com.segment.analytics.kotlin.core.platform.e.a.b(this, aVar);
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.platform.e.b c() {
        return this.f266905a;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void f(@NotNull com.segment.analytics.kotlin.core.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f266906b = aVar;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    public void i(@NotNull Settings settings, @NotNull com.segment.analytics.kotlin.core.platform.e.c type) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(type, "type");
        com.segment.analytics.kotlin.core.platform.e.a.c(this, settings, type);
        this.f266907c = settings;
    }

    @Override // com.segment.analytics.kotlin.core.platform.e
    @NotNull
    public com.segment.analytics.kotlin.core.a j() {
        com.segment.analytics.kotlin.core.a aVar = this.f266906b;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }
}
