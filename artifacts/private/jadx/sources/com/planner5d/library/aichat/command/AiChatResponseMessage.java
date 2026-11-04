package com.planner5d.library.aichat.command;

import com.squareup.moshi.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@i(generateAdapter = true)
@SourceDebugExtension({"SMAP\nAiChatResponseMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiChatResponseMessage.kt\ncom/planner5d/library/aichat/command/AiChatResponseMessage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1557#2:43\n1628#2,3:44\n1557#2:47\n1628#2,3:48\n*S KotlinDebug\n*F\n+ 1 AiChatResponseMessage.kt\ncom/planner5d/library/aichat/command/AiChatResponseMessage\n*L\n23#1:43\n23#1:44,3\n35#1:47\n35#1:48,3\n*E\n"})
public final class AiChatResponseMessage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private String f141955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<AiChatCommand> f141956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<? extends JSONObject> f141957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f141958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f141959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f141960f;

    public AiChatResponseMessage(@NotNull String textMessage, @NotNull List<AiChatCommand> commands, @NotNull List<? extends JSONObject> editorActions, @Nullable String str, int i10, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(commands, "commands");
        Intrinsics.checkNotNullParameter(editorActions, "editorActions");
        this.f141955a = textMessage;
        this.f141956b = commands;
        this.f141957c = editorActions;
        this.f141958d = str;
        this.f141959e = i10;
        this.f141960f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatResponseMessage h(AiChatResponseMessage aiChatResponseMessage, String str, List list, List list2, String str2, int i10, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aiChatResponseMessage.f141955a;
        }
        if ((i11 & 2) != 0) {
            list = aiChatResponseMessage.f141956b;
        }
        if ((i11 & 4) != 0) {
            list2 = aiChatResponseMessage.f141957c;
        }
        if ((i11 & 8) != 0) {
            str2 = aiChatResponseMessage.f141958d;
        }
        if ((i11 & 16) != 0) {
            i10 = aiChatResponseMessage.f141959e;
        }
        if ((i11 & 32) != 0) {
            str3 = aiChatResponseMessage.f141960f;
        }
        int i12 = i10;
        String str4 = str3;
        return aiChatResponseMessage.g(str, list, list2, str2, i12, str4);
    }

    @NotNull
    public final String a() {
        return this.f141955a;
    }

    @NotNull
    public final List<AiChatCommand> b() {
        return this.f141956b;
    }

    @NotNull
    public final List<JSONObject> c() {
        return this.f141957c;
    }

    @Nullable
    public final String d() {
        return this.f141958d;
    }

    public final int e() {
        return this.f141959e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AiChatResponseMessage) {
            AiChatResponseMessage aiChatResponseMessage = (AiChatResponseMessage) obj;
            if (this.f141959e == aiChatResponseMessage.f141959e && Intrinsics.areEqual(this.f141955a, aiChatResponseMessage.f141955a) && Intrinsics.areEqual(this.f141956b, aiChatResponseMessage.f141956b)) {
                List<? extends JSONObject> list = this.f141957c;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JSONObject) it.next()).toString());
                }
                List<? extends JSONObject> list2 = aiChatResponseMessage.f141957c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((JSONObject) it2.next()).toString());
                }
                if (Intrinsics.areEqual(arrayList, arrayList2) && Intrinsics.areEqual(this.f141958d, aiChatResponseMessage.f141958d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Nullable
    public final String f() {
        return this.f141960f;
    }

    @NotNull
    public final AiChatResponseMessage g(@NotNull String textMessage, @NotNull List<AiChatCommand> commands, @NotNull List<? extends JSONObject> editorActions, @Nullable String str, int i10, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(textMessage, "textMessage");
        Intrinsics.checkNotNullParameter(commands, "commands");
        Intrinsics.checkNotNullParameter(editorActions, "editorActions");
        return new AiChatResponseMessage(textMessage, commands, editorActions, str, i10, str2);
    }

    public int hashCode() {
        int iHashCode = ((this.f141955a.hashCode() * 31) + this.f141956b.hashCode()) * 31;
        List<? extends JSONObject> list = this.f141957c;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((JSONObject) it.next()).toString());
        }
        int iHashCode2 = (iHashCode + arrayList.hashCode()) * 31;
        String str = this.f141958d;
        return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f141959e;
    }

    @NotNull
    public final List<AiChatCommand> i() {
        return this.f141956b;
    }

    @NotNull
    public final List<JSONObject> j() {
        return this.f141957c;
    }

    @Nullable
    public final String k() {
        return this.f141958d;
    }

    public final int l() {
        return this.f141959e;
    }

    @Nullable
    public final String m() {
        return this.f141960f;
    }

    @NotNull
    public final String n() {
        return this.f141955a;
    }

    public final void o(@NotNull List<AiChatCommand> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f141956b = list;
    }

    public final void p(@NotNull List<? extends JSONObject> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f141957c = list;
    }

    public final void q(@Nullable String str) {
        this.f141958d = str;
    }

    public final void r(int i10) {
        this.f141959e = i10;
    }

    public final void s(@Nullable String str) {
        this.f141960f = str;
    }

    public final void t(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f141955a = str;
    }

    @NotNull
    public String toString() {
        return "AiChatResponseMessage(textMessage=" + this.f141955a + ", commands=" + this.f141956b + ", editorActions=" + this.f141957c + ", error=" + this.f141958d + ", progressCode=" + this.f141959e + ", progressMessage=" + this.f141960f + ")";
    }

    public /* synthetic */ AiChatResponseMessage(String str, List list, List list2, String str2, int i10, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? CollectionsKt.emptyList() : list, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? null : str3);
    }
}
