package com.superwall.sdk.debug.localizations;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.superwall.sdk.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class LocalizationAdapter extends RecyclerView.h<ViewHolder> {

    @NotNull
    private List<LocalizationGrouping> data;

    @NotNull
    private final Function1<String, Unit> onLocaleSelected;

    public static final class ViewHolder extends RecyclerView.g0 {

        @NotNull
        private final RecyclerView localeRecyclerView;

        @NotNull
        private final TextView titleTextView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R.id.title_text_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.titleTextView = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R.id.locale_recycler_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
            this.localeRecyclerView = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        }

        public final void bind(@NotNull LocalizationGrouping grouping, @NotNull Function1<? super String, Unit> onLocaleSelected) {
            Intrinsics.checkNotNullParameter(grouping, "grouping");
            Intrinsics.checkNotNullParameter(onLocaleSelected, "onLocaleSelected");
            this.titleTextView.setText(grouping.getTitle());
            this.localeRecyclerView.setAdapter(new LocaleAdapter(grouping.getLocalizations(), onLocaleSelected));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalizationAdapter(@NotNull List<LocalizationGrouping> data, @NotNull Function1<? super String, Unit> onLocaleSelected) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onLocaleSelected, "onLocaleSelected");
        this.data = data;
        this.onLocaleSelected = onLocaleSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.data.size();
    }

    public final void updateData(@NotNull List<LocalizationGrouping> newData) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.data = newData;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull ViewHolder holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.data.get(i10), this.onLocaleSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_localization, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate);
    }
}
