package io.intercom.android.sdk.m5.conversation.reducers;

import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.models.ComposerSuggestions;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nComposerSuggestionsReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposerSuggestionsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ComposerSuggestionsReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1557#2:25\n1628#2,3:26\n*S KotlinDebug\n*F\n+ 1 ComposerSuggestionsReducer.kt\nio/intercom/android/sdk/m5/conversation/reducers/ComposerSuggestionsReducerKt\n*L\n23#1:25\n23#1:26,3\n*E\n"})
public final class ComposerSuggestionsReducerKt {
    private static final List<ReplySuggestion> getReplySuggestions(ComposerSuggestions composerSuggestions) {
        List<ComposerSuggestions.Suggestion> suggestions = composerSuggestions.getSuggestions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(suggestions, 10));
        for (ComposerSuggestions.Suggestion suggestion : suggestions) {
            arrayList.add(new ReplySuggestion(suggestion.getUuid(), suggestion.getText()));
        }
        return arrayList;
    }

    @Nullable
    public static final ContentRow reduceComposerSuggestions(@NotNull ComposerSuggestions composerSuggestions) {
        Intrinsics.checkNotNullParameter(composerSuggestions, "composerSuggestions");
        if (composerSuggestions.getSuggestions().isEmpty()) {
            return null;
        }
        return new ContentRow.ComposerSuggestionRow(getReplySuggestions(composerSuggestions));
    }
}
