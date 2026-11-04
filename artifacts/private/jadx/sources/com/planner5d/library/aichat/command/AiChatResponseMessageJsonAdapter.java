package com.planner5d.library.aichat.command;

import com.squareup.moshi.a0;
import com.squareup.moshi.h;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.squareup.moshi.w;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AiChatResponseMessageJsonAdapter extends h<AiChatResponseMessage> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final m.b f141961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h<String> f141962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h<List<AiChatCommand>> f141963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<List<JSONObject>> f141964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final h<String> f141965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h<Integer> f141966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private volatile Constructor<AiChatResponseMessage> f141967g;

    public AiChatResponseMessageJsonAdapter(@NotNull w moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        m.b bVarA = m.b.a("textMessage", "commands", "editorActions", "error", "progressCode", "progressMessage");
        Intrinsics.checkNotNullExpressionValue(bVarA, "of(...)");
        this.f141961a = bVarA;
        h<String> hVarG = moshi.g(String.class, SetsKt.emptySet(), "textMessage");
        Intrinsics.checkNotNullExpressionValue(hVarG, "adapter(...)");
        this.f141962b = hVarG;
        h<List<AiChatCommand>> hVarG2 = moshi.g(a0.m(List.class, AiChatCommand.class), SetsKt.emptySet(), "commands");
        Intrinsics.checkNotNullExpressionValue(hVarG2, "adapter(...)");
        this.f141963c = hVarG2;
        h<List<JSONObject>> hVarG3 = moshi.g(a0.m(List.class, JSONObject.class), SetsKt.emptySet(), "editorActions");
        Intrinsics.checkNotNullExpressionValue(hVarG3, "adapter(...)");
        this.f141964d = hVarG3;
        h<String> hVarG4 = moshi.g(String.class, SetsKt.emptySet(), "error");
        Intrinsics.checkNotNullExpressionValue(hVarG4, "adapter(...)");
        this.f141965e = hVarG4;
        h<Integer> hVarG5 = moshi.g(Integer.TYPE, SetsKt.emptySet(), "progressCode");
        Intrinsics.checkNotNullExpressionValue(hVarG5, "adapter(...)");
        this.f141966f = hVarG5;
    }

    @Override // com.squareup.moshi.h
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AiChatResponseMessage b(@NotNull m reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.m1();
        List<JSONObject> listB = null;
        Integer numB = 0;
        List<AiChatCommand> listB2 = null;
        String strB = null;
        String strB2 = null;
        int i10 = -1;
        String strB3 = null;
        while (reader.hasNext()) {
            switch (reader.m(this.f141961a)) {
                case -1:
                    reader.t();
                    reader.a9();
                    break;
                case 0:
                    strB = this.f141962b.b(reader);
                    if (strB == null) {
                        throw Util.B("textMessage", "textMessage", reader);
                    }
                    break;
                    break;
                case 1:
                    listB2 = this.f141963c.b(reader);
                    if (listB2 == null) {
                        throw Util.B("commands", "commands", reader);
                    }
                    i10 &= -3;
                    break;
                    break;
                case 2:
                    listB = this.f141964d.b(reader);
                    if (listB == null) {
                        throw Util.B("editorActions", "editorActions", reader);
                    }
                    i10 &= -5;
                    break;
                    break;
                case 3:
                    strB3 = this.f141965e.b(reader);
                    i10 &= -9;
                    break;
                case 4:
                    numB = this.f141966f.b(reader);
                    if (numB == null) {
                        throw Util.B("progressCode", "progressCode", reader);
                    }
                    i10 &= -17;
                    break;
                    break;
                case 5:
                    strB2 = this.f141965e.b(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.F1();
        if (i10 == -63) {
            if (strB == null) {
                throw Util.s("textMessage", "textMessage", reader);
            }
            Intrinsics.checkNotNull(listB2, "null cannot be cast to non-null type kotlin.collections.List<com.planner5d.library.aichat.command.AiChatCommand>");
            Intrinsics.checkNotNull(listB, "null cannot be cast to non-null type kotlin.collections.List<org.json.JSONObject>");
            return new AiChatResponseMessage(strB, listB2, listB, strB3, numB.intValue(), strB2);
        }
        Constructor<AiChatResponseMessage> declaredConstructor = this.f141967g;
        if (declaredConstructor == null) {
            Class<?> cls = Util.f267160c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = AiChatResponseMessage.class.getDeclaredConstructor(String.class, List.class, List.class, String.class, cls2, String.class, cls2, cls);
            this.f141967g = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<AiChatResponseMessage> constructor = declaredConstructor;
        if (strB == null) {
            throw Util.s("textMessage", "textMessage", reader);
        }
        String str = strB2;
        AiChatResponseMessage aiChatResponseMessageNewInstance = constructor.newInstance(strB, listB2, listB, strB3, numB, str, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullExpressionValue(aiChatResponseMessageNewInstance, "newInstance(...)");
        return aiChatResponseMessageNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m(@NotNull t writer, @Nullable AiChatResponseMessage aiChatResponseMessage) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (aiChatResponseMessage == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.c();
        writer.o("textMessage");
        this.f141962b.m(writer, aiChatResponseMessage.n());
        writer.o("commands");
        this.f141963c.m(writer, aiChatResponseMessage.i());
        writer.o("editorActions");
        this.f141964d.m(writer, aiChatResponseMessage.j());
        writer.o("error");
        this.f141965e.m(writer, aiChatResponseMessage.k());
        writer.o("progressCode");
        this.f141966f.m(writer, Integer.valueOf(aiChatResponseMessage.l()));
        writer.o("progressMessage");
        this.f141965e.m(writer, aiChatResponseMessage.m());
        writer.g();
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("AiChatResponseMessage");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
