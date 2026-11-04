package com.devtodev.analytics.external.analytics;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDTDProgressionEventParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DTDProgressionEventParameters.kt\ncom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,77:1\n125#2:78\n152#2,3:79\n125#2:82\n152#2,3:83\n*S KotlinDebug\n*F\n+ 1 DTDProgressionEventParameters.kt\ncom/devtodev/analytics/external/analytics/DTDFinishProgressionEventParameters\n*L\n67#1:78\n67#1:79,3\n71#1:82\n71#1:83,3\n*E\n"})
public final class DTDFinishProgressionEventParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f98027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f98028c = MapsKt.emptyMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f98029d = MapsKt.emptyMap();

    @NotNull
    public final DTDFinishProgressionEventParameters clone$DTDAnalytics_androidRelease() {
        DTDFinishProgressionEventParameters dTDFinishProgressionEventParameters = new DTDFinishProgressionEventParameters();
        dTDFinishProgressionEventParameters.f98026a = this.f98026a;
        dTDFinishProgressionEventParameters.f98027b = this.f98027b;
        dTDFinishProgressionEventParameters.f98028c = this.f98028c;
        dTDFinishProgressionEventParameters.f98029d = this.f98029d;
        return dTDFinishProgressionEventParameters;
    }

    public final int getDuration() {
        return this.f98027b;
    }

    @NotNull
    public final Map<String, Long> getEarned() {
        return this.f98029d;
    }

    @NotNull
    public final Map<String, Long> getSpent() {
        return this.f98028c;
    }

    public final boolean getSuccessfulCompletion() {
        return this.f98026a;
    }

    public final void setDuration(int i10) {
        this.f98027b = i10;
    }

    public final void setEarned(@NotNull Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f98029d = map;
    }

    public final void setSpent(@NotNull Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f98028c = map;
    }

    public final void setSuccessfulCompletion(boolean z10) {
        this.f98026a = z10;
    }

    @NotNull
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n\t successfulCompletion: " + this.f98026a + "\n");
        stringBuffer.append("\t duration: " + this.f98027b + "\n");
        if (!this.f98028c.isEmpty()) {
            stringBuffer.append("\t spent: \n");
            Map map = this.f98028c;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                stringBuffer.append("\t\tresource: " + entry.getKey() + " amount: " + entry.getValue() + " \n");
                arrayList.add(stringBuffer);
            }
        }
        if (!this.f98029d.isEmpty()) {
            stringBuffer.append("\t earned: \n");
            Map map2 = this.f98029d;
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry entry2 : map2.entrySet()) {
                stringBuffer.append("\t\tresource: " + entry2.getKey() + " amount: " + entry2.getValue() + " \n");
                arrayList2.add(stringBuffer);
            }
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }
}
