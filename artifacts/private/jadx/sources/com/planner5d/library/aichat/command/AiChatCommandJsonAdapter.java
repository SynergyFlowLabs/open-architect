package com.planner5d.library.aichat.command;

import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import io.sentry.protocol.n;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nAiChatCommandJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatCommandJsonAdapter.kt\ncom/planner5d/library/aichat/command/AiChatCommandJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class AiChatCommandJsonAdapter extends h<AiChatCommand> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f141952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f141953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private volatile Constructor<AiChatCommand> f141954c;

    public AiChatCommandJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("command", n.f306405g, "title", "params");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f141952a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "command");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f141953b = hVarG;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AiChatCommand b(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        String strB = null;
        String strB2 = null;
        String strB3 = null;
        String strB4 = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iM = reader.m(this.f141952a);
            if (iM == -1) {
                reader.t();
                reader.a9();
            } else if (iM == 0) {
                strB = this.f141953b.b(reader);
                i10 &= -2;
            } else if (iM == 1) {
                strB2 = this.f141953b.b(reader);
                i10 &= -3;
            } else if (iM == 2) {
                strB3 = this.f141953b.b(reader);
                i10 &= -5;
            } else if (iM == 3) {
                strB4 = this.f141953b.b(reader);
                i10 &= -9;
            }
        }
        reader.F1();
        if (i10 == -16) {
            return new AiChatCommand(strB, strB2, strB3, strB4);
        }
        Constructor<AiChatCommand> declaredConstructor = this.f141954c;
        if (declaredConstructor == null) {
            declaredConstructor = AiChatCommand.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, Util.f267160c);
            this.f141954c = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        AiChatCommand aiChatCommandNewInstance = declaredConstructor.newInstance(strB, strB2, strB3, strB4, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(aiChatCommandNewInstance, "newInstance(...)");
        return aiChatCommandNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable AiChatCommand aiChatCommand) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (aiChatCommand == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("command");
        this.f141953b.m(writer, aiChatCommand.g());
        writer.o(n.f306405g);
        this.f141953b.m(writer, aiChatCommand.i());
        writer.o("title");
        this.f141953b.m(writer, aiChatCommand.j());
        writer.o("params");
        this.f141953b.m(writer, aiChatCommand.h());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AiChatCommand");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
