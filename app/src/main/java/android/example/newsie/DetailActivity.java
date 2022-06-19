package android.example.newsie;

import androidx.appcompat.app.AppCompatActivity;

import android.example.newsie.Models.Articles;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    Articles articles;
    TextView txtTitle, txtAuthor, txtTime, txtDetail, txtContent;
    ImageView imgNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        txtTitle = findViewById(R.id.text_desc_title);
        txtAuthor = findViewById(R.id.text_detail_author);
        txtTime = findViewById(R.id.text_detail_time);
        txtDetail = findViewById(R.id.text_detail_detail);
        txtContent = findViewById(R.id.text_desc_full);
        imgNews = findViewById(R.id.img_news);

        articles = (Articles) getIntent().getSerializableExtra("data");

        txtTitle.setText(articles.getTitle());
        txtAuthor.setText(articles.getAuthor());
        txtTime.setText(articles.getPublishedAt());
        txtDetail.setText(articles.getDescription());
        txtContent.setText(articles.getContent());

        Picasso.get().load(articles.getUrlToImage()).into(imgNews);
    }
}