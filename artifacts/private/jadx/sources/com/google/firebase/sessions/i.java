package com.google.firebase.sessions;

import com.devtodev.analytics.internal.storage.sqlite.PeopleCardEntry;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public final class i implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f125035b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f125036c = "FIREBASE_APPQUALITY_SESSION";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final z8.b<com.google.android.datatransport.m> f125037a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @ij.a
    public i(@NotNull z8.b<com.google.android.datatransport.m> transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f125037a = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(q0 q0Var) {
        String strA = r0.f125074a.d().a(q0Var);
        Intrinsics.checkNotNullExpressionValue(strA, "encode(...)");
        q0Var.g().name();
        byte[] bytes = strA.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.j
    public void a(@NotNull q0 sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "sessionEvent");
        this.f125037a.get().b(f125036c, q0.class, com.google.android.datatransport.e.b(PeopleCardEntry.json), new com.google.android.datatransport.k() { // from class: com.google.firebase.sessions.h
            @Override // com.google.android.datatransport.k
            public final Object apply(Object obj) {
                return this.f125033a.c((q0) obj);
            }
        }).b(com.google.android.datatransport.f.j(sessionEvent));
    }
}
