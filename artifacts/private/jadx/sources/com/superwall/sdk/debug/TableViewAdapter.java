package com.superwall.sdk.debug;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.superwall.sdk.R;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSWConsoleTableViewAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SWConsoleTableViewAdapter.kt\ncom/superwall/sdk/debug/TableViewAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n216#2,2:66\n1#3:68\n*S KotlinDebug\n*F\n+ 1 SWConsoleTableViewAdapter.kt\ncom/superwall/sdk/debug/TableViewAdapter\n*L\n21#1:66,2\n*E\n"})
public final class TableViewAdapter extends RecyclerView.h<ViewHolder> {

    @NotNull
    private List<Map.Entry<String, String>> data;
    private int pickerRow;

    public static final class ViewHolder extends RecyclerView.g0 {

        @NotNull
        private TextView text1;

        @NotNull
        private TextView text2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(R.id.text1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.text1 = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.text2);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.text2 = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getText1() {
            return this.text1;
        }

        @NotNull
        public final TextView getText2() {
            return this.text2;
        }

        public final void setText1(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.text1 = textView;
        }

        public final void setText2(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.text2 = textView;
        }
    }

    public TableViewAdapter(@NotNull List<Map.Entry<String, String>> data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
        this.pickerRow = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.data.size();
    }

    public final void updateData(@NotNull Map<String, String> newData, int i10) {
        Intrinsics.checkNotNullParameter(newData, "newData");
        this.pickerRow = i10;
        this.data.clear();
        Iterator<Map.Entry<String, String>> it = newData.entrySet().iterator();
        while (it.hasNext()) {
            this.data.add(it.next());
        }
        CollectionsKt.sortWith(this.data, new Comparator() { // from class: com.superwall.sdk.debug.TableViewAdapter$updateData$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return kotlin.comparisons.a.l((Comparable) ((Map.Entry) t10).getKey(), (Comparable) ((Map.Entry) t11).getKey());
            }
        });
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull ViewHolder holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List listListOf = CollectionsKt.listOf((Object[]) new String[]{"primary", "secondary", "tertiary"});
        String str = this.pickerRow < listListOf.size() ? (String) listListOf.get(this.pickerRow) : null;
        Map.Entry<String, String> entry = this.data.get(i10);
        String key = entry.getKey();
        holder.getText1().setText(entry.getValue());
        if (str != null) {
            String str2 = str + "." + key;
            if (str2 != null) {
                key = str2;
            }
        }
        holder.getText2().setText("{{ " + key + " }}");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new ViewHolder(viewInflate);
    }
}
