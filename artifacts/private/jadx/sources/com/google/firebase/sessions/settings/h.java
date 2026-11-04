package com.google.firebase.sessions.settings;

import androidx.datastore.core.l0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@SourceDebugExtension({"SMAP\nSessionConfigs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,59:1\n147#2:60\n*S KotlinDebug\n*F\n+ 1 SessionConfigs.kt\ncom/google/firebase/sessions/settings/SessionConfigsSerializer\n*L\n49#1:60\n*E\n"})
public final class h implements l0<SessionConfigs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f125127a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final SessionConfigs f125128b = new SessionConfigs(null, null, null, null, null);

    private h() {
    }

    @Override // androidx.datastore.core.l0
    @Nullable
    public Object M(@NotNull InputStream inputStream, @NotNull kotlin.coroutines.d<? super SessionConfigs> dVar) throws androidx.datastore.core.g {
        try {
            Json.Default r10 = Json.Default;
            String strF1 = StringsKt.F1(kotlin.io.b.p(inputStream));
            r10.getSerializersModule();
            return (SessionConfigs) r10.decodeFromString(SessionConfigs.Companion.serializer(), strF1);
        } catch (Exception e10) {
            throw new androidx.datastore.core.g("Cannot parse session configs", e10);
        }
    }

    @Override // androidx.datastore.core.l0
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public SessionConfigs K() {
        return f125128b;
    }

    @Override // androidx.datastore.core.l0
    @Nullable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Object L(@NotNull SessionConfigs sessionConfigs, @NotNull OutputStream outputStream, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        outputStream.write(StringsKt.I1(Json.Default.encodeToString(SessionConfigs.Companion.serializer(), sessionConfigs)));
        return Unit.f312394a;
    }
}
