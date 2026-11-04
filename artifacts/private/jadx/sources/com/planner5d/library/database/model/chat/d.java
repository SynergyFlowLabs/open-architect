package com.planner5d.library.database.model.chat;

import com.planner5d.library.aichat.command.AiChatResponseMessage;
import java.util.Date;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nDefaultChatRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultChatRepository.kt\ncom/planner5d/library/database/model/chat/DefaultChatRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1863#2,2:42\n*S KotlinDebug\n*F\n+ 1 DefaultChatRepository.kt\ncom/planner5d/library/database/model/chat/DefaultChatRepository\n*L\n27#1:42,2\n*E\n"})
public final class d implements va.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<b> f154127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ua.a f154128b;

    @kotlin.coroutines.jvm.internal.f(c = "com.planner5d.library.database.model.chat.DefaultChatRepository", f = "DefaultChatRepository.kt", i = {0}, l = {21, 22}, m = "getChatMessages", n = {"this"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f154129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f154130b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f154132d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f154130b = obj;
            this.f154132d |= Integer.MIN_VALUE;
            return d.this.a(0L, this);
        }
    }

    @ij.a
    public d(@NotNull fg.e<b> chatMessageDao, @NotNull ua.a converter) {
        Intrinsics.checkNotNullParameter(chatMessageDao, "chatMessageDao");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.f154127a = chatMessageDao;
        this.f154128b = converter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(List<com.planner5d.library.database.model.chat.a> list, kotlin.coroutines.d<? super Unit> dVar) {
        Object objA;
        boolean z10 = false;
        for (IndexedValue indexedValue : CollectionsKt.withIndex(list)) {
            com.planner5d.library.database.model.chat.a aVar = (com.planner5d.library.database.model.chat.a) indexedValue.getValue();
            if (aVar.a() == null) {
                aVar.f(kotlin.coroutines.jvm.internal.b.a(indexedValue.getIndex() % 2 == 1));
                aVar.g(this.f154128b.b(new AiChatResponseMessage(aVar.getText(), null, null, null, 0, null, 62, null)));
                z10 = true;
            }
        }
        return (z10 && (objA = this.f154127a.get().a(list, dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objA : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // va.b
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super List<? extends va.b.a>> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f154132d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f154132d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objB = aVar.f154130b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f154132d;
        if (i11 == 0) {
            ResultKt.m(objB);
            b bVar = this.f154127a.get();
            aVar.f154129a = this;
            aVar.f154132d = 1;
            objB = bVar.b(j10, aVar);
            if (objB != objL) {
            }
            return objL;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj = aVar.f154129a;
            ResultKt.m(objB);
            return obj;
        }
        this = (d) aVar.f154129a;
        ResultKt.m(objB);
        aVar.f154129a = objB;
        aVar.f154132d = 2;
        if (this.h((List) objB, aVar) != objL) {
            return objB;
        }
        return objL;
    }

    @Override // va.b
    @Nullable
    public Object f(long j10, @NotNull va.b.a aVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objA = this.f154127a.get().a(CollectionsKt.listOf(new com.planner5d.library.database.model.chat.a(0, j10, new Date().getTime(), "", aVar.getJson(), aVar.a())), dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}
