package com.example.demo.controller;import java.util.List;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;import com.example.demo.classes.MySeat;
import com.example.demo.classes.ShowDummy;
import com.example.demo.modal.City;
import com.example.demo.modal.Seat;
import com.example.demo.service.SeatService;@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SeatController {
@Autowired
SeatService seatService;
@PostMapping("/listofseats")
List<MySeat> GetListOfSeats(@RequestBody ShowDummy show)
{
System.out.println("show "+show);
return seatService.GetListOfSeats(show.getShowId());
}
@PostMapping("/setseat")
public Seat AddSeat(@RequestBody Seat seat)
{
return this.seatService.addSeat(seat);
}
}
