package rf;

import com.sdk.growthbook.utils.GBStickyAssignmentsDocument;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.d;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nGBStickyBucketServiceImp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GBStickyBucketServiceImp.kt\ncom/sdk/growthbook/stickybucket/GBStickyBucketServiceImp\n+ 2 Json.kt\nkotlinx/serialization/json/JsonKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,72:1\n309#2:73\n113#3:74\n216#4,2:75\n*S KotlinDebug\n*F\n+ 1 GBStickyBucketServiceImp.kt\ncom/sdk/growthbook/stickybucket/GBStickyBucketServiceImp\n*L\n27#1:73\n45#1:74\n63#1:75,2\n*E\n"})
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f366652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final d f366653b;

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // rf.a
    @NotNull
    public Map<String, GBStickyAssignmentsDocument> a(@NotNull Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            GBStickyAssignmentsDocument gBStickyAssignmentsDocumentB = b(entry.getKey(), entry.getValue());
            if (gBStickyAssignmentsDocumentB != null) {
                linkedHashMap.put(gBStickyAssignmentsDocumentB.j() + "||" + gBStickyAssignmentsDocumentB.k(), gBStickyAssignmentsDocumentB);
            }
        }
        return linkedHashMap;
    }

    @Override // rf.a
    @Nullable
    public GBStickyAssignmentsDocument b(@NotNull String attributeName, @NotNull String attributeValue) {
        Intrinsics.checkNotNullParameter(attributeName, "attributeName");
        Intrinsics.checkNotNullParameter(attributeValue, "attributeValue");
        String str = attributeName + "||" + attributeValue;
        d dVar = this.f366653b;
        if (dVar != null) {
            JsonElement jsonElementB = dVar.b(this.f366652a + str);
            if (jsonElementB != null) {
                try {
                    Json.Default r10 = Json.Default;
                    r10.getSerializersModule();
                    return (GBStickyAssignmentsDocument) r10.decodeFromJsonElement(GBStickyAssignmentsDocument.Companion.serializer(), jsonElementB);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    @Override // rf.a
    public void c(@NotNull GBStickyAssignmentsDocument doc) {
        Intrinsics.checkNotNullParameter(doc, "doc");
        String str = doc.j() + "||" + doc.k();
        d dVar = this.f366653b;
        if (dVar != null) {
            try {
                Json.Default r10 = Json.Default;
                r10.getSerializersModule();
                dVar.a(this.f366652a + str, r10.parseToJsonElement(r10.encodeToString(GBStickyAssignmentsDocument.Companion.serializer(), doc)));
            } catch (Exception unused) {
            }
        }
    }

    public b(@NotNull String prefix, @Nullable d dVar) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f366652a = prefix;
        this.f366653b = dVar;
    }

    public /* synthetic */ b(String str, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "gbStickyBuckets__" : str, (i10 & 2) != 0 ? null : dVar);
    }
}
