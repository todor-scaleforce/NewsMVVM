package com.example.newsmvvm.adapters;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.newsmvvm.R;
import com.example.newsmvvm.databinding.ArticleItemBinding;
import com.example.newsmvvm.models.Article;

import java.util.ArrayList;

/**
 * Created by tosheto on 2/13/2018.
 */
public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder> {

    private static final String TAG = ArticlesAdapter.class.getSimpleName();

    private ArrayList<Article> data;


    public ArticlesAdapter(ArrayList<Article> data) {
        this.data = data;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ArticleItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.article_item,
                parent, false);
        return new ViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Article article = data.get(position);
        holder.bind(article);
    }


    @Override
    public int getItemCount() {
        return data.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ArticleItemBinding binding;

        public ViewHolder(ArticleItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Article article) {
            binding.setArticle(article);
        }
    }
}