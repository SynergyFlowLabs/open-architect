package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.p;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nCrashlyticsRemoteConfigListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1557#2:41\n1628#2,3:42\n*S KotlinDebug\n*F\n+ 1 CrashlyticsRemoteConfigListener.kt\ncom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener\n*L\n27#1:41\n27#1:42,3\n*E\n"})
public final class e implements com.google.firebase.remoteconfig.interop.rollouts.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f121240a;

    public e(@NotNull p userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f121240a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.f
    public void a(@NotNull com.google.firebase.remoteconfig.interop.rollouts.e rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        p pVar = this.f121240a;
        Set<com.google.firebase.remoteconfig.interop.rollouts.d> setB = rolloutsState.b();
        Intrinsics.checkNotNullExpressionValue(setB, "getRolloutAssignments(...)");
        Set<com.google.firebase.remoteconfig.interop.rollouts.d> set = setB;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        for (com.google.firebase.remoteconfig.interop.rollouts.d dVar : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.j.b(dVar.f(), dVar.d(), dVar.e(), dVar.h(), dVar.g()));
        }
        pVar.t(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
