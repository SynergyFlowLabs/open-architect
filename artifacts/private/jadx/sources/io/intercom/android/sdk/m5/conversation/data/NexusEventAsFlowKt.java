package io.intercom.android.sdk.m5.conversation.data;

import com.google.gson.v;
import io.ably.lib.realtime.l;
import io.intercom.android.nexus.EventData;
import io.intercom.android.nexus.NexusClient;
import io.intercom.android.nexus.NexusEvent;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.nexus.NexusListener;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.avatar.AvatarShape;
import io.intercom.android.sdk.models.Avatar;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.j0;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nNexusEventAsFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NexusEventAsFlow.kt\nio/intercom/android/sdk/m5/conversation/data/NexusEventAsFlowKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n1557#2:179\n1628#2,3:180\n*S KotlinDebug\n*F\n+ 1 NexusEventAsFlow.kt\nio/intercom/android/sdk/m5/conversation/data/NexusEventAsFlowKt\n*L\n143#1:179\n143#1:180,3\n*E\n"})
public final class NexusEventAsFlowKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NexusEventType.values().length];
            try {
                iArr[NexusEventType.AdminIsTyping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NexusEventType.UserContentSeenByAdmin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NexusEventType.NewComment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NexusEventType.ConversationPartToken.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1, reason: invalid class name */
    @f(c = "io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1", f = "NexusEventAsFlow.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends o implements Function2<l0<? super ParsedNexusEvent>, d<? super Unit>, Object> {
        final /* synthetic */ NexusClient $nexusClient;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NexusClient nexusClient, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$nexusClient = nexusClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NexusClient nexusClient, NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1 nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1) {
            nexusClient.removeEventListener(nexusEventAsFlowKt$nexusEventAsFlow$1$listener$1);
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$nexusClient, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.intercom.android.nexus.NexusListener, io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.m(obj);
                final l0 l0Var = (l0) this.L$0;
                final ?? r10 = new NexusListener() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$nexusEventAsFlow$1$listener$1
                    @Override // io.intercom.android.nexus.NexusListener
                    public void notifyEvent(NexusEvent nexusEvent) {
                        Intrinsics.checkNotNullParameter(nexusEvent, "nexusEvent");
                        Objects.toString(nexusEvent.getEventType());
                        Objects.toString(nexusEvent.getEventData());
                        l0Var.p(NexusEventAsFlowKt.asNexusData(nexusEvent));
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnect() {
                        l0Var.p(ParsedNexusEvent.NexusConnected.INSTANCE);
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onConnectFailed() {
                    }

                    @Override // io.intercom.android.nexus.NexusListener
                    public void onShutdown() {
                        o0.a.a(l0Var.s(), null, 1, null);
                    }
                };
                this.$nexusClient.addEventListener(r10);
                final NexusClient nexusClient = this.$nexusClient;
                Function0 function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.data.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NexusEventAsFlowKt.AnonymousClass1.invokeSuspend$lambda$0(nexusClient, r10);
                    }
                };
                this.label = 1;
                if (j0.b(l0Var, function0, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(l0<? super ParsedNexusEvent> l0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParsedNexusEvent asNexusData(NexusEvent nexusEvent) throws JSONException {
        List listBuild;
        NexusEventType eventType = nexusEvent.getEventType();
        int i10 = eventType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i10 == 1) {
            String strOptString = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String strOptString2 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
            Avatar.Builder builderWithImageUrl = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar"));
            AvatarShape.Companion companion = AvatarShape.Companion;
            String strOptString3 = nexusEvent.getEventData().optString("avatarShape");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "optString(...)");
            Avatar avatarBuild = builderWithImageUrl.withShape(companion.fromName(strOptString3)).build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild, "build(...)");
            EventData eventData = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData, "getEventData(...)");
            Object objSafeGetOrDefault = safeGetOrDefault(eventData, "isBot", Boolean.FALSE);
            Intrinsics.checkNotNull(objSafeGetOrDefault, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) objSafeGetOrDefault).booleanValue();
            EventData eventData2 = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData2, "getEventData(...)");
            Object objSafeGetOrDefault2 = safeGetOrDefault(eventData2, "showAvatar", Boolean.TRUE);
            Intrinsics.checkNotNull(objSafeGetOrDefault2, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue2 = ((Boolean) objSafeGetOrDefault2).booleanValue();
            String strOptString4 = nexusEvent.getEventData().optString(l.f287647j);
            Intrinsics.checkNotNullExpressionValue(strOptString4, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping(strOptString, strOptString2, avatarBuild, zBooleanValue, zBooleanValue2, strOptString4);
        }
        if (i10 == 2) {
            String strOptString5 = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(strOptString5, "optString(...)");
            String strOptString6 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(strOptString6, "optString(...)");
            Avatar avatarBuild2 = new Avatar.Builder().withImageUrl(nexusEvent.getEventData().optString("adminAvatar")).build();
            Intrinsics.checkNotNullExpressionValue(avatarBuild2, "build(...)");
            EventData eventData3 = nexusEvent.getEventData();
            Intrinsics.checkNotNullExpressionValue(eventData3, "getEventData(...)");
            Object objSafeGetOrDefault3 = safeGetOrDefault(eventData3, "isBot", Boolean.FALSE);
            Intrinsics.checkNotNull(objSafeGetOrDefault3, "null cannot be cast to non-null type kotlin.Boolean");
            return new ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin(strOptString5, strOptString6, avatarBuild2, ((Boolean) objSafeGetOrDefault3).booleanValue());
        }
        if (i10 == 3) {
            String strOptString7 = nexusEvent.getEventData().optString("conversationId");
            Intrinsics.checkNotNullExpressionValue(strOptString7, "optString(...)");
            String strOptString8 = nexusEvent.getEventData().optString("createdByUserId");
            Intrinsics.checkNotNullExpressionValue(strOptString8, "optString(...)");
            return new ParsedNexusEvent.ConversationNexusEvent.NewComment(strOptString7, strOptString8, nexusEvent.getEventData().optString("ticketId"), null, 8, null);
        }
        if (i10 != 4) {
            return ParsedNexusEvent.UnSupportedEvent.INSTANCE;
        }
        Object obj = nexusEvent.getEventData().get("blocks");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type org.json.JSONArray");
        JSONArray jSONArray = (JSONArray) obj;
        try {
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Type type = new com.google.gson.reflect.a<ArrayList<Block.Builder>>() { // from class: io.intercom.android.sdk.m5.conversation.data.NexusEventAsFlowKt$asNexusData$blocks$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            ArrayList arrayList = (ArrayList) new com.google.gson.f().s(string, type);
            Intrinsics.checkNotNull(arrayList);
            listBuild = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                listBuild.add(((Block.Builder) it.next()).build());
            }
        } catch (v unused) {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                Object obj2 = jSONArray.get(i11);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj2;
                Block blockBuild = new Block.Builder().withType(jSONObject.optString("type")).withText(jSONObject.optString("text")).build();
                Intrinsics.checkNotNullExpressionValue(blockBuild, "build(...)");
                listCreateListBuilder.add(blockBuild);
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        }
        List list = listBuild;
        String strOptString9 = nexusEvent.getEventData().optString("conversationId");
        Intrinsics.checkNotNullExpressionValue(strOptString9, "optString(...)");
        String strOptString10 = nexusEvent.getEventData().optString("clientAssignedUuid");
        Intrinsics.checkNotNullExpressionValue(strOptString10, "optString(...)");
        String strOptString11 = nexusEvent.getEventData().optString("partType");
        Intrinsics.checkNotNullExpressionValue(strOptString11, "optString(...)");
        Object obj3 = nexusEvent.getEventData().get("tokenSequenceIndex");
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
        return new ParsedNexusEvent.ConversationNexusEvent.FinStreaming(strOptString9, strOptString10, strOptString11, ((Integer) obj3).intValue(), list);
    }

    @NotNull
    public static final i<ParsedNexusEvent> nexusEventAsFlow(@NotNull NexusClient nexusClient) {
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        return k.t(new AnonymousClass1(nexusClient, null));
    }

    private static final Object safeGetOrDefault(EventData eventData, String str, Object obj) {
        Object orDefault = eventData.getOrDefault(str, obj);
        Intrinsics.checkNotNull(orDefault);
        return orDefault;
    }
}
