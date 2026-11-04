package com.superwall.sdk.debug.localizations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.superwall.sdk.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LocaleAdapter extends RecyclerView.h<LocaleViewHolder> {

    @NotNull
    private final List<LocalizationOption> localizations;

    @NotNull
    private final Function1<String, Unit> onLocaleSelected;

    public static final class LocaleViewHolder extends RecyclerView.g0 {

        @NotNull
        private final TextView countryTextView;

        @NotNull
        private final TextView languageTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocaleViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.language_text_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.languageTextView = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.country_text_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.countryTextView = (TextView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(Function1 function1, LocalizationOption localizationOption, View view) {
            function1.invoke(localizationOption.getLocale());
        }

        public final void bind(@NotNull final LocalizationOption localizationOption, @NotNull final Function1<? super String, Unit> onLocaleSelected) {
            Intrinsics.checkNotNullParameter(localizationOption, "localizationOption");
            Intrinsics.checkNotNullParameter(onLocaleSelected, "onLocaleSelected");
            this.languageTextView.setText(localizationOption.getDescription());
            this.countryTextView.setText(localizationOption.getLocale());
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.superwall.sdk.debug.localizations.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocaleAdapter.LocaleViewHolder.bind$lambda$0(onLocaleSelected, localizationOption, view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocaleAdapter(@NotNull List<LocalizationOption> localizations, @NotNull Function1<? super String, Unit> onLocaleSelected) {
        Intrinsics.checkNotNullParameter(localizations, "localizations");
        Intrinsics.checkNotNullParameter(onLocaleSelected, "onLocaleSelected");
        this.localizations = localizations;
        this.onLocaleSelected = onLocaleSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.localizations.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull LocaleViewHolder holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.localizations.get(i10), this.onLocaleSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public LocaleViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_locale, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new LocaleViewHolder(viewInflate);
    }
}
