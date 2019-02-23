package fr.kungfunantes.backend.model.rank;

import com.google.common.base.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RankResource {

	@Autowired
	private RankRepository rankRepository;

    @GetMapping("/ranks")
    @ResponseBody
	public List<Rank> byName(@RequestParam(value = "name", required = false, defaultValue = "") String name) {
        return rankRepository.findByNameContaining(name);
	}

    @PostMapping("/ranks")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Rank create(@RequestBody Rank rank) {
        return Preconditions.checkNotNull(rankRepository.save(rank));
    }
 
    @DeleteMapping("/ranks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") Long id) {
        rankRepository.deleteById(id);
    }
}
