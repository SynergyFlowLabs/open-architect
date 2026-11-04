package com.google.firebase.sessions;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
@SourceDebugExtension({"SMAP\nSessionData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionData.kt\ncom/google/firebase/sessions/SessionDataSerializer\n*L\n49#1:60\n*E\n"})
public final class o0 implements androidx.datastore.core.l0<SessionData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final v0 f125067a;

    @ij.a
    public o0(@NotNull v0 sessionGenerator) {
        Intrinsics.checkNotNullParameter(sessionGenerator, "sessionGenerator");
        this.f125067a = sessionGenerator;
    }

    @Override // androidx.datastore.core.l0
    @Nullable
    public Object M(@NotNull InputStream inputStream, @NotNull kotlin.coroutines.d<? super SessionData> dVar) throws androidx.datastore.core.g {
        try {
            Json.Default r10 = Json.Default;
            String strF1 = StringsKt.F1(kotlin.io.b.p(inputStream));
            r10.getSerializersModule();
            return (SessionData) r10.decodeFromString(SessionData.Companion.serializer(), strF1);
        } catch (Exception e10) {
            throw new androidx.datastore.core.g("Cannot parse session data", e10);
        }
    }

    @Override // androidx.datastore.core.l0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SessionData K() {
        return new SessionData(this.f125067a.a(null), (Time) null, (Map) null, 6, (DefaultConstructorMarker) null);
    }

    @Override // androidx.datastore.core.l0
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object L(@NotNull SessionData sessionData, @NotNull OutputStream outputStream, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        outputStream.write(StringsKt.I1(Json.Default.encodeToString(SessionData.Companion.serializer(), sessionData)));
        return Unit.f312394a;
    }
}
