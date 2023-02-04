package pl.stormit.tinyurl.service;


import com.google.common.hash.Hashing;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.stormit.tinyurl.domain.model.Url;
import pl.stormit.tinyurl.domain.model.UrlExpiry;
import pl.stormit.tinyurl.domain.repository.UrlExpiryRepository;

@Service
@AllArgsConstructor
public class UrlExpiryService {

    @Autowired
    private final UrlExpiryRepository urlExpiryRepository;

    public UrlExpiry createUrlExpiryDate(Url url){

        UrlExpiry urlExpiry = new UrlExpiry();

        urlExpiry.setUrl(url);

        return urlExpiryRepository.save(urlExpiry);
    }
}
